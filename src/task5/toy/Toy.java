package task5.toy;

import task5.quality.Color;

public abstract class Toy {
    public final int cost;
    public final int weight;
    public final Color color;

    public Toy(int cost, int weight, Color color) {
        this.cost = cost;
        this.weight = weight;
        this.color = color;
    }
}
