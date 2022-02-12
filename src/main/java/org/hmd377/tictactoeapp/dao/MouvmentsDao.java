package org.hmd377.tictactoeapp.dao;

import org.hmd377.tictactoeapp.entities.Mouvments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MouvmentsDao extends JpaRepository<Mouvments, Integer>,JpaSpecificationExecutor<Mouvments> {
    
}
