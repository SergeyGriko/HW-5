public class Main {
    public static void main(String[] args) {

// Первая задача
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("Установите версию приложения для iOS по ссылке");
// Вторая задача
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите последнюю версию приложения для Android по ссылке");
            if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите последнюю версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
// Третья задача
        int year = 2021;
        if (year >= 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("В " + year + " году ещё не придумали високосный год");
        }
// Четвертая задача
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет " + day + " сутки");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("Доставка займет " + day + " суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("Доставка займет " + day + " суток");
        } else {
            System.out.println("Доставка свыше 100км не осуществялется");
        }
// Четвертая задача

    }
}