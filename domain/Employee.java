package fr.efrei.domain;

public class Employee {
    private int id;
    private String name;
    private String competency;

    public Employee(int id, String name, String competency) {
        this.id = id;
        this.name = name;
        this. competency = competency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", competency='" + competency + '\'' +
                '}';
    }
}
