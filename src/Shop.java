import clothes.Shirt;
import clothes.Sokcs;
import food.Apple;
import food.Bread;
import gadgets.Charger;
import gadgets.Phone;
import gadgets.Toaster;
import products.Products;

import java.util.Scanner;

public class Shop { //Single Responsibility Principle выполняет только роль магазина
    static Products[] products = {new Apple(), new Bread(), new Shirt(),
            new Sokcs(), new Phone(), new Toaster(), new Charger()};

    public static void printProducts(Products[] products) {
        System.out.println("Ознакомтесь с перечнем товаров: ");
        for (int i = 0; i < products.length; i++) {  //ИЗБЕГАНИЕ МАГИЧЕСКИХ ЧИСЕЛ
            System.out.println((i + 1) + ". " + products[i]);
        }
    }

    public static void printBasket(Products[] products) {
        int sumBasket = 0;
        for (Products product : products) {
            if (product.getCount() != 0) {
                sumBasket += product.getCount() * product.getCost();
                System.out.println(product + " 'Количество' - " + product.getCount() + " шт."
                        + " 'Цена' - " + product.getCost() + " "
                        + " Стоимость' - " + product.getCount() * product.getCost());
            }
        }
        System.out.println("Итого: " + sumBasket);
    }

    public static void purchase() {
        Scanner scanner = new Scanner(System.in);

        printProducts(products); //DRY
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`. " +
                    "(Чтобы посмотреть ассортимент - нажмите '0')");
            String input = scanner.nextLine();
            if ("0".equals(input)) {
                printProducts(products); //DRY
                continue;
            }
            if ("end".equals(input)) {
                for (Products product : products) { //ИЗБЕГАНИЕ МАГИЧЕСКИХ ЧИСЕЛ
                    if (product.getCount() >= 1 && product.getName().equals("Телефон")) {
                        System.out.println("Добавить в корзину запасную зарядку для телефона?\n" +
                                "Yes/No");
                        String in = scanner.nextLine();
                        if ("Yes".equals(in)) {
                            for (Products charge : products) { //ИЗБЕГАНИЕ МАГИЧЕСКИХ ЧИСЕЛ
                                if (charge.getName().equals("Зарядка")) {
                                    charge.setCount(1);
                                    System.out.println("Зарядка добавлена!");
                                }
                            }
                        }
                    }
                }
                System.out.println("Ваша корзина:");
                printBasket(products); //DRY
                break;
            }
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            products[productNumber].setCount(Integer.parseInt(parts[1]));
        }
    }
}
