package entities;

public class Account {
    private int account;
    private String name;
    private double value;

    public Account(int account, String name) {
        this.account = account;
        this.name = name;
    }

    public Account(int account, String name, double initialDeposit) {
        this.account = account;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getAccount () {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }



    public String toString () {
        return "Account " + account +
                ", " + "Holder: " + name
                + ", " +
                String.format("Balance: $%.2f%n", value);
    }

    public void deposit (double value) {
        this.value += value;
    }


    public void withdraw (double value) {
        this.value -= value + 5;
    }

}
