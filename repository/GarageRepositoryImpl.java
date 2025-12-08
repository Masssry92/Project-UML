package fr.efrei.repository;

import fr.efrei.domain.Garage;
import java.util.ArrayList;
import java.util.List;

public class GarageRepositoryImpl implements GarageRepository {

    private static GarageRepositoryImpl instance;
    private List<Garage> garages = new ArrayList<>();

    private GarageRepositoryImpl() {}

    public static GarageRepositoryImpl getInstance() {
        if (instance == null) instance = new GarageRepositoryImpl();
        return instance;
    }

    @Override
    public void add(Garage garage) {
        garages.add(garage);
    }

    @Override
    public Garage findById(int id) {
        return garages.stream().filter(g -> g.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Garage> findAll() {
        return garages;
    }
}
