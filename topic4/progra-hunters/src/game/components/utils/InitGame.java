package game.components.utils;

import java.util.ArrayList;

import game.components.Ball;

public class InitGame {
    static private ArrayList<ArrayList<Ball>> splitArray(ArrayList<Ball> balls) {
        ArrayList<ArrayList<Ball>> result = new ArrayList<>();
        Integer startIndex = 0;
        Integer groupInteger = 1;
        while (startIndex < balls.size() && groupInteger < 6) {
            Integer endIndex = Math.min(startIndex + groupInteger, balls.size());
            ArrayList<Ball> group = new ArrayList<>(balls.subList(startIndex, endIndex));
            result.add(group);
            startIndex = endIndex;
            groupInteger++;
        }
        return result;
    }
    static public void orderPosition(ArrayList<Ball> balls, Integer x, Integer y) {
        ArrayList<ArrayList<Ball>> result = InitGame.splitArray(balls);
        for (ArrayList<Ball> group : result) {
            Integer positionX = x;
            Integer positionY = y;
            orderLine(group, positionX, positionY);
            x += 24;
        }
    }
    static private void orderLine(ArrayList<Ball> group, Integer x, Integer y) {
        for (Ball ball : group) {
            ball.setX(x.doubleValue());
            ball.setY(y.doubleValue());
            y -= 12;
        }
    }
}
