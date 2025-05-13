package basicpractice;

public class MiniBankingApp {

    // BankAccount class inside MiniBankingApp
    static class BankAccount {
//        // Encapsulated Fields
        private String bankName;
        private String accountNumber;
        private double accountBalance;

        // Constructor
        public BankAccount(String bankName, String accountNumber, double initialBalance) {
            this.bankName = bankName;
            this.accountNumber = accountNumber;
            this.accountBalance = initialBalance;
        }

        // Getter methods
        public String getBankName() { return bankName; }
        public String getAccountNumber() { return accountNumber; }
        public double getAccountBalance() { return accountBalance; }

        // Method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                accountBalance += amount;
                System.out.println("Deposited: Rs." + amount);
            } else {
                System.out.println("Deposit amount must be greater than 0.");
            }
        }

        // Method to withdraw money
        public void withdraw(double amount) {
            if (amount > 0 && amount <= accountBalance) {
                accountBalance -= amount;
                System.out.println("Withdrawn: Rs." + amount);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds.");
            }
        }

        // Method to display account details
        public void displayAccountInfo() {
            System.out.println("\n--- Account Information ---");
            System.out.println("Bank Name      : " + bankName);
            System.out.println("Account Number : " + accountNumber);
            System.out.println("Account Balance: Rs." + accountBalance);
        }
    }

    // Main method
    public static void main(String[] args) {
        BankAccount account = new BankAccount("SBI", "1234567890", 5000);
        account.displayAccountInfo();
        account.deposit(1500);
        account.withdraw(2000);
        account.withdraw(10000);
        account.displayAccountInfo();
    }
}
// static class BankAccount {
//    // Encapsulated Fields
//    private String bankName;
//    private String accountNumber;
//    private double accountBalance;
//    // Constructor
//    public BankAccount(String bankName, String accountNumber, double initialBalance) {
//        this.bankName = bankName;
//        this.accountNumber = accountNumber;
//        this.accountBalance = initialBalance;
//    }
//    // Getter methods
//    public String getBankName() { return bankName; }
//    public String getAccountNumber() { return accountNumber; }
//    public double getAccountBalance() { return accountBalance; }
//    // Method to deposit money
//    public void deposit(double amount) {
//        if (amount > 0) {
//            accountBalance += amount;
//            System.out.println("Deposited: Rs." + amount);
//        } else {
//            System.out.println("Deposit amount must be greater than 0.");
//        }
//    }
//    // Method to withdraw money
//    public void withdraw(double amount) {
//        if (amount > 0 && amount <= accountBalance) {
//            accountBalance -= amount;
//            System.out.println("Withdrawn: Rs." + amount);
//        } else {
//            System.out.println("Invalid withdrawal amount or insufficient funds.");
//        }
//    }
//    // Method to display account details
//    public void displayAccountInfo() {
//        System.out.println("\n--- Account Information ---");
//        System.out.println("Bank Name      : " + bankName);
//        System.out.println("Account Number : " + accountNumber);
//        System.out.println("Account Balance: Rs." + accountBalance);
//}
//    }
//        
// // Sample usage
// public class Main {
//    public static void main(String[] args) {
//        BankAccount account = new BankAccount("SBI", "1234567890", 5000);
//        account.displayAccountInfo();
//        account.deposit(1500);
//        account.withdraw(2000);
//        account.withdraw(10000);
//        account.displayAccountInfo();
//    }
// }
//
//
//}
//
//}