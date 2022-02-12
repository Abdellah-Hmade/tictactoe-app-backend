package org.hmd377.tictactoeapp.dao;

import org.hmd377.tictactoeapp.entities.GameUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface GameUsersDao extends JpaRepository<GameUsers, Integer>,JpaSpecificationExecutor<GameUsers> {
    
}
