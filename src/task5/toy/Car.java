package task5.toy;

import task5.quality.Color;

public class Car extends Toy {
    public final String mark;
    public final int maxSpeed;
    private int position;
    private int speed;
    private int acceleration;

    public int getSpeed(){
        return speed;
    }

    public int getPosition() {
        return position;
    }

    public Car(int weight, int cost, Color color, String mark, int maxSpeed, int acceleration) {
        super(weight, cost, color);
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
    }

    public void Move() {
        position += speed;
    }

    public void accelerate() {
        speed += acceleration;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    public void brake() {
        speed -= acceleration;
        if (speed < 0) {
            speed = 0;
        }
    }
}
