package fr.efrei.repository;

import fr.efrei.domain.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class VehicleRepositoryImpl implements VehicleRepository {

    private static VehicleRepositoryImpl instance;
    private List<Vehicle> vehicles = new ArrayList<>();

    private VehicleRepositoryImpl() {}

    public static VehicleRepositoryImpl getInstance() {
        if (instance == null) instance = new VehicleRepositoryImpl();
        return instance;
    }

    @Override
    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    @Override
    public Vehicle findByPlate(String plate) {
        return vehicles.stream().filter(v -> v.getPlate().equals(plate)).findFirst().orElse(null);
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicles;
    }
}
