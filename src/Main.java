public class Main {
    public static void main(String[] args) {
        int startingamount = 300; // Начальная сумма на счету
        int depositamount = 1300; // Сумма пополнения

        int bonus;
        if (depositamount > 1000) {
            bonus = depositamount / 100;
        } else  {
            bonus = 0;
        }

        System.out.println("К зачислению: " + bonus);


    }
}