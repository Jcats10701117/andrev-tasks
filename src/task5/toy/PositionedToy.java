package task5.toy;

import task5.quality.Color;
import task5.position.Point;

public abstract class PositionedToy extends Toy {
    protected Point position;
    public PositionedToy(int cost, int weight, Color color) {
        super(cost, weight, color);
    }
    public Point getPosition() {
        return position;
    }
    public void MoveBy(int dx, int dy) {
        position = new Point(position.x + dx, position.y + dy);
    }
}
