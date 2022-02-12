package org.hmd377.tictactoeapp.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info_game")
public class InfoGame implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "status")
    private String status;// Pending -- Terminated -- Waiting
    
    @Column(name = "last_time_used")
    private Date lastTimeUsed;
    
    @Column(name = "time_start")
    private Date timeStart;
    
    @Column(name = "minutes_left")
    private String minutesLeft;

    @Column(name = "minutes_start")
    private String minutesStart;


    public InfoGame() {
    }

    public InfoGame(Integer id, String status, Date lastTimeUsed, Date timeStart, String minutesLeft,
            String minutesStart) {
        this.id = id;
        this.status = status;
        this.lastTimeUsed = lastTimeUsed;
        this.timeStart = timeStart;
        this.minutesLeft = minutesLeft;
        this.minutesStart = minutesStart;

    }

    public Integer getId() {
        return id;
    }

    public String getMinutesStart() {
        return minutesStart;
    }

    public void setMinutesStart(String minutesStart) {
        this.minutesStart = minutesStart;
    }

    public String getMinutesLeft() {
        return minutesLeft;
    }

    public void setMinutesLeft(String minutesLeft) {
        this.minutesLeft = minutesLeft;
    }

    public Date getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }

    public Date getLastTimeUsed() {
        return lastTimeUsed;
    }

    public void setLastTimeUsed(Date lastTimeUsed) {
        this.lastTimeUsed = lastTimeUsed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
