class Bank {
    String bankName = "National Bank";

    void showBankDetails() {
        System.out.println("Bank Name: " + bankName);
    }
}


class Account extends Bank {
    String accHolder;
    double balance;

    Account(String accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
    }

    void showAccount() {
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accHolder, double balance, double interestRate) {
        super(accHolder, balance);
        this.interestRate = interestRate;
    }

    void showSavingsDetails() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


public class MultilevelDemo {
    public static void main(String[] args) {
        SavingsAccount savAcc = new SavingsAccount("Kiran", 10000, 4.5);
        savAcc.showBankDetails();     
        savAcc.showAccount();        
        savAcc.showSavingsDetails(); }
}
output:-
Bank Name: National Bank
Account Holder: Kiran
Balance: 10000.0
Interest Rate: 4.5%

