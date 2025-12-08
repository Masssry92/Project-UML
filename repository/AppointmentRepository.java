package repository;

import domain.Appointment;
import java.util.List;

public interface AppointmentRepository {
    void add(Appointment appointment);
    Appointment findById(int id);
    List<Appointment> findAll();
}

