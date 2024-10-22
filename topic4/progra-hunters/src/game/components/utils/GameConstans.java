package game.components.utils;

public enum GameConstans {
    WIDTH(800),
    HEIGHT(600);

    private Integer value;

    GameConstans(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
