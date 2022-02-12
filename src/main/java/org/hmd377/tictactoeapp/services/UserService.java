package org.hmd377.tictactoeapp.services;

import org.hmd377.tictactoeapp.vo.UserVo;

public interface UserService extends GeneralService<UserVo>{
    public UserVo get(Integer id);
	
}
