package clothes;

import products.Products;

public class Shirt extends Products implements Clothes {
    //Liskov substitution principle - Рубашка является Одеждой, поэтому может сыграть роль свого предка
    private final String name = "Рубашка";
    private final int cost = 600;
    private final String category = "Одежда";
    @Override
    public void putOn() {
        System.out.println("Рубашка вам очень подходит!");
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
