package fr.efrei.repository;

import fr.efrei.domain.Repair;
import java.util.ArrayList;
import java.util.List;

public class RepairRepositoryImpl implements RepairRepository {

    private static RepairRepositoryImpl instance;
    private List<Repair> repairs = new ArrayList<>();

    private RepairRepositoryImpl() {}

    public static RepairRepositoryImpl getInstance() {
        if (instance == null) instance = new RepairRepositoryImpl();
        return instance;
    }

    @Override
    public void add(Repair repair) {
        repairs.add(repair);
    }

    @Override
    public Repair findById(int id) {
        return repairs.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Repair> findAll() {
        return repairs;
    }
}
