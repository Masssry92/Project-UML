package factory;

import domain.Appointment;
import domain.Customer;
import domain.Garage;

import java.util.Date;

public class AppointmentFactory {

    public static Appointment createAppointment(int id, Date date, String reason, 
                                                Customer customer, Garage garage) {

        Appointment appointment = new Appointment(id, date, reason);

        customer.setAppointment(appointment);  
        garage.addAppointment(appointment);     

        return appointment;
    }
}
