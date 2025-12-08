package repository;

import domain.Garage;
import java.util.List;

public interface GarageRepository {
    void add(Garage garage);
    Garage findById(int id);
    List<Garage> findAll();
}
