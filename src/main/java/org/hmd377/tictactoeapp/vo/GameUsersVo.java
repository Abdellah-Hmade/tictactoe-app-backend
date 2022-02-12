package org.hmd377.tictactoeapp.vo;

public class GameUsersVo{
    
    private Integer id;
    
    private UserVo user;
    
    private InfoGameVo infoGame;

    private Boolean victoryOrLose;

    public GameUsersVo(Integer id, UserVo user, InfoGameVo infoGame, Boolean vicotyOrlose) {
        this.id = id;
        this.user = user;
        this.infoGame = infoGame;
        this.victoryOrLose = vicotyOrlose;
    }

    public GameUsersVo(){}

    public GameUsersVo(Integer id, UserVo user, InfoGameVo infoGame) {
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
    public void setUser(UserVo user){
        this.user=user;
    }

    public UserVo getUser() {
        return user;
    }

    public void setInfoGame(InfoGameVo infoGame){
        this.infoGame=infoGame;
    }


    public InfoGameVo getInfoGame() {
        return infoGame;
    }

    public void setVictoryOrLose(Boolean vicBoolean){
        this.victoryOrLose=vicBoolean;
    }


    public Boolean getVictoryOrLose() {
        return victoryOrLose;
    }
}
