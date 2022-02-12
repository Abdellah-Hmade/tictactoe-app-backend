package org.hmd377.tictactoeapp.dao;

import org.hmd377.tictactoeapp.entities.InfoGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface InfoGameDao extends JpaRepository<InfoGame, Integer>,JpaSpecificationExecutor<InfoGame> {
    
}
