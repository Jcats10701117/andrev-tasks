package task5.toy;
import task5.HandMadeList;
import task5.quality.Color;
import task5.quality.Gender;

import java.util.Collection;

public class Doll extends Toy {
    public final String name;
    public final Gender gender;
    private final Collection<String> clothes;

    public Doll(int weight, int cost, Color color, String name, Gender gender) {
        super(weight, cost, color);
        this.name = name;
        this.gender = gender;
        clothes = new HandMadeList<>();
    }

    public void putOn(String dress) {
        if (dress == null) return;
        clothes.add(dress);
    }

    public void putOff(String dress) {
        if (dress == null) return;
        for (var d: clothes) {
            if (dress.equals(d)) {
                clothes.remove(d);
            }
        }
    }

    public String[] currentClothes() {
        var arr = new String[clothes.size()];
        var oldArr = clothes.toArray();
        for (int i = 0 ; i < clothes.size(); i++) {
            arr[i] = (String) oldArr[i];
        }
        return arr;
    }
}
