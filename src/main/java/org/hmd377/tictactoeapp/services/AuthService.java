package org.hmd377.tictactoeapp.services;


import org.hmd377.tictactoeapp.vo.UserTokenVo;
import org.hmd377.tictactoeapp.vo.UserVo;

public interface AuthService {
	
	UserTokenVo login(UserVo loginRequest);

	UserTokenVo register(UserVo registerRequest);
}
