package food;

import products.Products;

public class Bread extends Products implements Food {
    private final String name = "Хлеб";
    private final int cost = 60;
    private final String category = "Еда";

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

    @Override
    public void eat() {
        System.out.println("Поглащаю хлебушек");
    }
}

