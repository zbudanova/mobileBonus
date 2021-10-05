public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int amountDeposit = 1100;
        int bonus;
        if (amountDeposit >1000) {
            bonus = amountDeposit / 100 + amountDeposit;
        } else {
            bonus = amountDeposit;
        }
        int totalAmount = initialAmount + bonus;
        System.out.println(totalAmount);

    }
}
