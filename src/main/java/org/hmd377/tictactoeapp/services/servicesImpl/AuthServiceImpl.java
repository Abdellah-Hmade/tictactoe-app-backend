package org.hmd377.tictactoeapp.services.servicesImpl;
import org.hmd377.tictactoeapp.component.AuthServiceComp;
import org.hmd377.tictactoeapp.dao.UserDao;
import org.hmd377.tictactoeapp.entities.User;
import org.hmd377.tictactoeapp.exception.CustomException;
import org.hmd377.tictactoeapp.services.AuthService;
import org.hmd377.tictactoeapp.vo.UserTokenVo;
import org.hmd377.tictactoeapp.vo.UserVo;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    private final AuthServiceComp jwt;

    @Autowired
    UserDao usersDao;
  
    @Autowired
    public AuthServiceImpl(final AuthServiceComp jwt) {
      this.jwt = jwt;
    }
  
    public UserTokenVo login(UserVo loginRequest) {
      String phone = loginRequest.getUserName();
      Boolean objectExists = usersDao.existsByUserName(phone);
  
      UserVo userVo = new UserVo();
  
      if (objectExists) {
        User users = usersDao.getByUserName(phone);
  
        if (!BCrypt.checkpw(loginRequest.getPassword(), users.getPassword())) {
          throw new CustomException(
            HttpStatus.NOT_FOUND,
            404,
            "username or password not correct"
          );
        }
  
        BeanUtils.copyProperties(users, userVo);
      } else {
        throw new CustomException(
          HttpStatus.NOT_FOUND,
          404,
          "username or password not correct"
        );
      }
  /*
      String accessToken = jwt.generate(userVo, "ACCESS");
      String refreshToken = jwt.generate(userVo, "REFRESH");
  
      TokenVo tokenVo = new TokenVo();
      tokenVo.setAccessToken(accessToken);
      tokenVo.setRefreshToken(refreshToken);
  */
      UserTokenVo userTokenVo = new UserTokenVo(
        userVo,
        jwt.generate(userVo, "ACCESS"),
        jwt.generate(userVo, "REFRESH")
      );
      /*
      userVo.setPassword("");
      tokenVo.setUser(userVo);
  */
      return userTokenVo;
    }
  
    public UserTokenVo register(UserVo registerRequest) {
    
      String phone = registerRequest.getUserName();
      Boolean objectAlreadyExists = usersDao.existsByUserName(phone);
  
      UserVo userVo = new UserVo();
      User users = new User();
  
      if (!objectAlreadyExists) {
        BeanUtils.copyProperties(registerRequest, users);
  
        String pass = BCrypt.hashpw(
          registerRequest.getPassword(),
          BCrypt.gensalt()
        );
  
        users.setPassword(pass);
  
        users = usersDao.save(users);
  
        BeanUtils.copyProperties(users, userVo);
      } else {
        throw new CustomException(
          HttpStatus.CONFLICT,
          409,
          "Ressource exist with the same id"
        );
      }
  
      /*String accessToken = jwt.generate(userVo, "ACCESS");
      String refreshToken = jwt.generate(userVo, "REFRESH");*/
  
      UserTokenVo tokenVo = new UserTokenVo(
        userVo,
        jwt.generate(userVo, "ACCESS"),
        jwt.generate(userVo, "REFRESH")
      );
  
      return tokenVo;
    }

}