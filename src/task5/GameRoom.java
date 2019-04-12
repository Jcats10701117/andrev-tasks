package task5;

import task5.toy.Toy;

import java.util.Collection;

public class GameRoom {
    private final Collection<Toy> toys;
    public GameRoom() {
        this.toys = new HandMadeList<>();
    }
    public Toy[] getToys() {
        var newArr = new Toy[toys.size()];
        var oldArr = toys.toArray();
        for (int i = 0; i < toys.size(); i++){
            newArr[i] = (Toy) oldArr[i];
        }
        return newArr;
    }
}
