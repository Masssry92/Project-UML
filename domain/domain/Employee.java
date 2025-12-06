package domain;

public class Employee {

    private final int id;
    private final String name;
    private final String competency;

    private Employee(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.competency = builder.competency;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompetency() {
        return competency;
    }


    public static class Builder {
        private int id;
        private String name; 
        private String competency;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCompetency(String competency) {
            this.competency = competency;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
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
