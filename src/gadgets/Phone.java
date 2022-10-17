package gadgets;

import products.Products;

public class Phone extends Products implements Gadgets {
    //Liskov substitution principle - Телефон является Гаджетом, поэтому может сыграть роль свого предка
    private final String name = "Телефон";
    private final int cost = 5000;
    private final String category = "Гаджеты";


    @Override
    public void turnOn() {
        System.out.println("Включился экран, все работает.");
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
