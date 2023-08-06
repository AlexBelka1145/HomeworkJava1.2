public class Main {
    public static void main(String[] args) {
        int startingAmount = 300; // Начальная сумма на счету
        int depositAmount = 1300; // Сумма пополнения

        int bonus;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }

        System.out.println("К зачислению: " + bonus);


    }
}