package org.hmd377.tictactoeapp.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "game_users")
public class GameUsers implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "info_game_id")
    private InfoGame infoGame;

    @Column(name="victory_or_lose")
    private Boolean victoryOrLose;

    public GameUsers(Integer id, User user, InfoGame infoGame, Boolean vicotyOrlose) {
        this.id = id;
        this.user = user;
        this.infoGame = infoGame;
        this.victoryOrLose = vicotyOrlose;
    }

    public GameUsers(){}

    public GameUsers(Integer id, User user, InfoGame infoGame) {
        this.id = id;
        this.user = user;
        this.infoGame = infoGame;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setUser(User user){
        this.user=user;
    }

    public User getUser() {
        return user;
    }

    public void setInfoGame(InfoGame infoGame){
        this.infoGame=infoGame;
    }


    public InfoGame getInfoGame() {
        return infoGame;
    }

    public void setVictoryOrLose(Boolean vicBoolean){
        this.victoryOrLose=vicBoolean;
    }


    public Boolean getVictoryOrLose() {
        return victoryOrLose;
    }
}
