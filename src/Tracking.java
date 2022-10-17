import products.Products;

public class Tracking { //Single Responsibility Principle отдельно от Shop'a выполняет отслеживание товара
    static int MONTH = 30;

    public static void tracking() {
        for (Products product : Shop.products) {
            if (product.getName().equals("Телефон") || product.getName().equals("Тостер")) { //ИЗБЕГАНИЕ МАГИЧЕСКИХ ЧИСЕЛ
                if (product.getCount() > 0) {
                    if (MONTH <= 0) {
                        System.out.println("Ваш " + product.getName() +
                                " ожидает получения");
                    } else {
                        System.out.println("Ваш " + product.getName() +
                                " будет доставлен в магазин через " + MONTH + " дней");
                        MONTH--;
                    }

                } else {
                    System.out.println("Вы еще не купили " + product.getName() + "!");
                }
            }
        }
    }
}
