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


class LoanAccount extends Bank {
    String loanType;
    double loanAmount;

    LoanAccount(String loanType, double loanAmount) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
    }

    void showLoanDetails() {
        System.out.println("Loan Type: " + loanType);
        System.out.println("Loan Amount: " + loanAmount);
    }
}

public class HierarchicalDemo {
    public static void main(String[] args) {
        Account acc = new Account("Trisha", 5000);
        acc.showBankDetails();
        acc.showAccount();

        System.out.println();

        LoanAccount loan = new LoanAccount("Home Loan", 200000);
        loan.showBankDetails();
        loan.showLoanDetails();
    }
}

output:-
Bank Name: National Bank
Account Holder: Trisha
Balance: 5000.0

Bank Name: National Bank
Loan Type: Home Loan
Loan Amount: 200000.0


