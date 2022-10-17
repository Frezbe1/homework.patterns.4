package gadgets;

import products.Products;

public class Toaster extends Products implements Gadgets {
    private final String name = "Тостер";
    private final int cost = 2000;
    private final String category = "Гаджеты";

    @Override
    public void turnOn() {
        System.out.println("Разогрелся за 2 минуты. Нужно остудить.");
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
