package fr.efrei.factory;

import fr.efrei.domain.Appointment;
import java.util.Date;

public class AppointmentFactory {

    public static Appointment createAppointment(int id, Date date, String reason) {
        return new Appointment(id, date, reason);
    }
}
