package repository;

import domain.Repair;
import java.util.List;

public interface RepairRepository {
    void add(Repair repair);
    Repair findById(int id);
    List<Repair> findAll();
}
