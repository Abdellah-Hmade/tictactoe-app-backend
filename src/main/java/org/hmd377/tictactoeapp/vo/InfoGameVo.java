package org.hmd377.tictactoeapp.vo;


public class InfoGameVo{
    

    private Integer id;

    private String status;// Pending -- Terminated -- Waiting
    
    private String lastTimeUsed;
    
    private String timeStart;
    
    private String minutesLeft;

    private String minutesStart;


    public InfoGameVo() {
    }

    public InfoGameVo(Integer id, String status, String lastTimeUsed, String timeStart, String minutesLeft,
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

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getLastTimeUsed() {
        return lastTimeUsed;
    }

    public void setLastTimeUsed(String lastTimeUsed) {
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
