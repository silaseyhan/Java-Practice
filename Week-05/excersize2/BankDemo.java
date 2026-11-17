package excersize2;

public class BankDemo {

    public static void main(String[] args) {

        // Create Bank
        Bank bank = new Bank();

        // Customer Arrivals
        bank.arrive("Ali");
        bank.arrive("Ayse");
        bank.arrive("Mehmet");
        bank.arrive("Zeynep");
        bank.arrive("Can");

        // Display Status
        bank.displayStatus();

        // Complete Teller 2
        bank.completeTransaction(2);

        // Display Updated Status
        bank.displayStatus();

        // Complete Teller 1
        bank.completeTransaction(1);

        // Display Updated Status
        bank.displayStatus();
    }
}