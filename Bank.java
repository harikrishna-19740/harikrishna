import java.util.Scanner;

class Bank {

    double amount;

    Bank(double amount) {
        this.amount = amount;
    }

    void withdraw(double w) {
        System.out.println((w <= amount) ? "Withdrawal successful" : "Insufficient balance");
        amount = (w <= amount) ? amount - w : amount;
    }

    void deposit(double d) {
        amount += d;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial amount: ");
        double initialAmount = sc.nextDouble();

        Bank b = new Bank(initialAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = sc.nextDouble();
        b.withdraw(withdrawAmount);

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        b.deposit(depositAmount);

        System.out.println("Total Balance: " + b.amount);

        sc.close();
    }
}