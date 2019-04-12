package task5;

import task5.toy.Toy;

public class ToyCounter {
    public int getTotalCost(Toy[] toys) {
        int allCost = 0;
        for (var toy: toys) {
            allCost += toy.cost;
        }
        return allCost;
    }
    public int getTotalWeight(Toy[] toys) {
        int allWeight = 0;
        for (var toy: toys) {
            allWeight += toy.weight;
        }
        return allWeight;
    }
    public Toy getMostExpensiveToy(Toy[] toys) {
        if (toys.length == 0) return null;
        Toy expensiveToy = toys[0];
        for (var toy: toys) {
            if (expensiveToy.cost < toy.cost) {
                expensiveToy = toy;
            }
        }
        return expensiveToy;
    }
}
