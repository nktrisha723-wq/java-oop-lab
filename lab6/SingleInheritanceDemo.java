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

public class SingleDemo {
    public static void main(String[] args) {
        Account acc = new Account("Trisha", 5000);
        acc.showBankDetails();   
        acc.showAccount();
    }
}

ouput:-
Bank Name: National Bank
Account Holder: Trisha
Balance: 5000.0


