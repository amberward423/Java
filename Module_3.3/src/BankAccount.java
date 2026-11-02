public class BankAccount {
    private int accountNumber;
    private double balance;
    private static int totalAccounts;

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());

    }
    public BankAccount(double balance){
        this.balance = balance;
        totalAccounts ++;
        accountNumber = totalAccounts;

    }
    void deposit(double amount){
        balance = amount + balance;
    }
    void withdraw(double amount){
        balance = balance - amount;
    }
    int getAccountNumber(){
        return accountNumber;
    }
    double getBalance(){
        return balance;
    }
    public static int getTotalAccounts(){
        return totalAccounts;
    }
}