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

    }
}