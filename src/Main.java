import products.Products;

import java.util.Scanner;

public class Main {
    static Shop shop = new Shop();
    static Tracking tracking = new Tracking();

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в наш магазин! Рады вас видеть!");
        Scanner scanner = new Scanner(System.in);

        while (true) { //DRY
            System.out.println("Какой услугой вы хотели воспользоваться? \n" +
                    "1. Покупка товаров в магазине. \n" +
                    "2. Поиск товара по ключевым словам. \n" +
                    "3. Отслеживание доставки техники. \n" +
                    "4. Выход из магазина.");
            int input = scanner.nextInt();
            if (input == 1) {
                shop.purchase();
                continue;
            }
            if (input == 2) {
                System.out.println("Данный раздел находиться в разработке!");
                //TODO search();
                continue;
            }
            if (input == 3) {
                tracking.tracking();
                continue;
            }
            if (input == 4) {
                break;
            } else {
                System.out.println("Такой операции нет!\n");
            }
        }
        System.out.println("Спасибо за посещения нашего магазина! Хорошего вам дня!");
    }
}
