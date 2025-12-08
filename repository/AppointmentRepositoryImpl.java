package fr.efrei.repository;

import fr.efrei.domain.Appointment;
import java.util.ArrayList;
import java.util.List;

public class AppointmentRepositoryImpl implements AppointmentRepository {

    private static AppointmentRepositoryImpl instance;
    @SuppressWarnings("FieldMayBeFinal")
    private List<Appointment> appointments = new ArrayList<>();

    private AppointmentRepositoryImpl() {}

    public static AppointmentRepositoryImpl getInstance() {
        if (instance == null) instance = new AppointmentRepositoryImpl();
        return instance;
    }

    @Override
    public void add(Appointment appointment) {
        appointments.add(appointment);
    }

    @Override
    public Appointment findById(int id) {
        return appointments.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Appointment> findAll() {
        return appointments;
    }
}
