package clothes;

import products.Products;

public class Sokcs extends Products implements Clothes {
    private final String name = "Носки";
    private final int cost = 200;
    private final String category = "Одежда";

    @Override
    public void putOn() {
        System.out.println("Вы выбрали смешные носки с динозаврами!");
    }

    @Override
    public String toString() {
        return name + ": Цена - " + cost + "руб.";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
