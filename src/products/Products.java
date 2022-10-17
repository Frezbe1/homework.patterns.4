package products;

abstract public class Products {
    //Open-Closed Principle класс закрыт для модицикации, но открыт для расширения
    private String name;
    private int cost;
    private int count;
    private String category;

    public Products setName(String name) {
        this.name = name;
        return this;
    }

    public abstract String getName();
    //Dependency inversion principle

    public abstract String getCategory();
    //Dependency inversion principle

    public boolean isEmpty() {
        return name.isBlank() || cost == 0;
    }

    public Products setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public int getCost() {
        return cost;
    }

    public Products setCount(int count) {
        this.count += count;
        return this;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return name + ": Цена - " + cost + "руб.";
    }
}
