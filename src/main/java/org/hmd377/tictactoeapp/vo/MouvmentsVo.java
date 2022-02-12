package org.hmd377.tictactoeapp.vo;

public class MouvmentsVo{
    
    private Integer id;
    
    private GameUsersVo GameUsers;

    private Integer checked;//[1-9]
    
    public Integer getId() {
        return id;
    }
    public Integer getChecked() {
        return checked;
    }
    public void setChecked(Integer checked) {
        this.checked = checked;
    }
    public GameUsersVo getGameUsers() {
        return GameUsers;
    }
    public void setGameUsers(GameUsersVo gameUsers) {
        this.GameUsers = gameUsers;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
