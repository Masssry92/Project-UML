package domain;

public class Tire {

    private final int id;
    private final String type;
    private final int wheel;

    private Tire(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.wheel = builder.wheel;
    }
    
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", wheel=" + wheel +
                '}';
    }

    
    public static class Builder {
        private int id;
        private String type;
        private int wheel;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setWheel(int wheel) {
            this.wheel = wheel;
            return this;
        }

        public Tire build() {
            return new Tire(this);
        }
    }
}
