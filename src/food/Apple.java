package food;

import products.Products;

public class Apple extends Products implements Food {
    //Liskov substitution principle - Яблоко является Едой, поэтому может сыграть роль свого предка
    private final String name = "Яблоко";
    private final int cost = 30;
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
    public int getCost(){
        return cost;
    }

    @Override
    public void eat() {
        System.out.println("Поглащаю яблоко");
    }
}
