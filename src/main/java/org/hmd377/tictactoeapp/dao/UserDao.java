package org.hmd377.tictactoeapp.dao;

import org.hmd377.tictactoeapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User> {

    Boolean existsByUserName(String userName);

    User getByUserName(String phone);
    
}
