public class Main {
    public static void main(String[] args) {

// Первая задача
        System.out.println("Первая задача:");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else
            System.out.println("Установите версию приложения для iOS по ссылке");
// Вторая задача
        System.out.println("Вторая задача:");
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите последнюю версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите последнюю версию приложения для iOS по ссылке");
            }
// Третья задача
            System.out.println("Третья задача:");
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
            System.out.println("Четвертая задача:");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставка свыше 100км не осуществялется");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = day + 2;
            System.out.println("Доставка займет " + day + " суток");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = day + 1;
            System.out.println("Доставка займет " + day + " суток");
        } else {
            System.out.println("Доствка займет " + day + " суток");

        }
// Пятая задача
            System.out.println("Пятая задача:");
        int monthNumber = 7;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}}