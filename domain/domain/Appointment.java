package domain;

import java.util.Date;

public class Appointment {
    private final int id;
    private final Date date;
    private final String reason;

    private Appointment(Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.reason = builder.reason;
    }


    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getReason() {
        return reason;
    }


    public static class Builder {
        private int id;
        private Date date;
        private String reason;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Appointment build() {
            return new Appointment(this);
        }
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
