package fr.efrei.repository;

import fr.efrei.domain.Garage;
import java.util.List;

public interface GarageRepository {
    void add(Garage garage);
    Garage findById(int id);
    List<Garage> findAll();
}
