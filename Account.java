//Fig 3.13 - page 89
package chapter_3_part3;

public class Account {

    private double balance;

    //CONSTRUCTOR BELOW
    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    } // end CONSTRUCTOR

    public void credit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() {
        return balance;
    }
}
