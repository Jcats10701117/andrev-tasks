package task5.toy;

import task5.quality.Color;

public class Ball extends Toy {
    public final int elasticity;
    private int position;

    public Ball(int cost, int weight, Color color, int elasticity) {
        super(cost, weight, color);
        this.elasticity = elasticity;
    }

    public int getPosition() {
        return position;
    }

    public void kick() {
        this.position += elasticity;
    }
}
