public class Main {

    public static void main(String[] args) {
/*
        int balance = 120;
        int creditAmount = 1570;
        int bonus = creditAmount > 1000 ? creditAmount / 100 : 0;

 */
        int balance = 120;
        int creditAmount = 1570;

        int bonus;
        if (creditAmount > 1000) {
            bonus = creditAmount / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Текущий баланс составляет " + (balance + creditAmount + bonus) + " рубля(ей)");
        System.out.println("Сумма бонуса равна = " + bonus + " рубля(ей)");

    }

}
