public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int amount = 1400;
        int sum = balance + amount;
        int bonus = amount / 100;
        int total = sum + bonus;

        if (amount >= 1000) {
            System.out.println("Количество бонусных рублей: " + bonus);
            System.out.println("Итоговый счёт: " + total);

        } else {
            System.out.println("Итоговый счёт: " + sum);

        }
    }
}