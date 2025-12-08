package fr.efrei.repository;

import fr.efrei.domain.Repair;
import java.util.List;

public interface RepairRepository {
    void add(Repair repair);
    Repair findById(int id);
    List<Repair> findAll();
}
