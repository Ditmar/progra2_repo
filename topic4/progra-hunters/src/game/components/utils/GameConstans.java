package game.components.utils;

public enum GameConstans {
    WHITE_BALL_INIT_POSITION_X(40),
    WHITE_BALL_INIT_POSITION_Y(230),
    BALLS_INIT_POSITION_X(400),
    BALLS_INIT_POSITION_Y(230),

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
