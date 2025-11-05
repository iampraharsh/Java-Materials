package demo;

public class Test {


    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(322333);
        bankAccount.deposit(-10); //Invalid Deposit Amount
        bankAccount.withdraw(10); // Invalid amount or Insufficient Balance
        bankAccount.deposit(100); // Deposited: 100.0
        bankAccount.withdraw(10); // Withdrew 10.0
        System.out.println(bankAccount.getBalance()); // 90.0

    }


}
