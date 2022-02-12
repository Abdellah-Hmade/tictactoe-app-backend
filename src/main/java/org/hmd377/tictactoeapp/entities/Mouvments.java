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
@Table(name = "mouvments")
public class Mouvments implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name="game_users_id")
    private GameUsers GameUsers;

    @Column(name="checked")
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
    public GameUsers getGameUsers() {
        return GameUsers;
    }
    public void setGameUsers(GameUsers gameUsers) {
        this.GameUsers = gameUsers;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
