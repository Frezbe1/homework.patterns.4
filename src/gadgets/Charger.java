package gadgets;

import products.Products;

public class Charger extends Products implements Gadgets {
    //Open-Closed Principle - класс не модифицирует Products, а только расширяет
    private final String name = "Зарядка";
    private final int cost = 500;
    private final String category = "Гаджеты";

    @Override
    public void turnOn() {
        System.out.println("Все работает.");
    }

    @Override
    public String toString() {
        return name + ": Цена - " + cost + "руб.";
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCategory() {
        return category;
    }
}