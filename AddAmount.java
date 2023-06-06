class AddAmount {
    private static double initialAmount = 50.0;
    private double amount;
    private static int transactionCount;

    public AddAmount() {
        this.amount = initialAmount;
    }

    public AddAmount(double amount) {
        this.amount = initialAmount + amount;
        transactionCount++;
    }

    public double getAmount() {
        return amount;
    }

    public static int getTransactionCount() {
        return transactionCount;
    }
}

public class SavingBoxDemo {
    public static void main(String[] args) {
        AddAmount savingBox1 = new AddAmount();
        System.out.println("Final amount in saving box 1: $" + savingBox1.getAmount());
        System.out.println("Transactions done: " + AddAmount.getTransactionCount());

        AddAmount savingBox2 = new AddAmount(30.0);
        System.out.println("Final amount in saving box 2: $" + savingBox2.getAmount());
        System.out.println("Transactions done: " + AddAmount.getTransactionCount());
    }
}