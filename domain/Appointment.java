package fr.efrei.domain;

import java.util.Date;

public class Appointment {
    private int id;
    private Date date;
    private String reason;

    public Appointment(int id, Date date, String reason) {
        this.id = id;
        this.date = date;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", date=" + date +
                ", reason='" + reason + '\'' +
                '}';
    }
}
