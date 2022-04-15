package Lab03;

public class BankAccount {
    private static final double globalInterestRate = 0.02;
    private static int bankAccountCount = 1;

    private int id;
    private double balance;
    private static double interestRate = globalInterestRate;

    public BankAccount(){
        this.id = bankAccountCount++ ;
    }

    public int getId(){
        return this.id;
    }

    public double getBalance(){
        return this.balance;
    }
    public static void setInterestRate(double rate){
        interestRate = rate;
    }
    public static double getInterestRate(int years){
        return interestRate * years;
    }

    public void deposit(double amount){
        this.balance += amount;
    }
}
