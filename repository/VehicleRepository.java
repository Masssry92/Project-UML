package repository;

import domain.Vehicle;
import java.util.List;

public interface VehicleRepository {
    void add(Vehicle vehicle);
    Vehicle findByPlate(String plate);
    List<Vehicle> findAll();
}
