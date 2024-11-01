package game.components.utils;

public enum PhysicsConstans {
    FRICTION(0.01),
    GRAVITY(0.0);

    private Double value;

    PhysicsConstans(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
