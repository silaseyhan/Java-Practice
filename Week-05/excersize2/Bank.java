package excersize2;

public class Bank {

    private String[] tellers;
    private Queue waitingQueue;

    public Bank() {

        tellers = new String[3];

        tellers[0] = null;
        tellers[1] = null;
        tellers[2] = null;

        waitingQueue = new Queue();
    }

    // Customer Arrival
    public void arrive(String customerName) {

        System.out.println("Customer " + customerName + " arrived.");

        for (int i = 0; i < tellers.length; i++) {

            if (tellers[i] == null) {

                tellers[i] = customerName;

                System.out.println(customerName +
                        " is assigned to Teller " + (i + 1) + ".");

                return;
            }
        }

        System.out.println("All tellers are busy.");

        waitingQueue.enqueue(customerName);

        System.out.println(customerName +
                " joins the waiting queue.");
    }

    // Complete Transaction
    public void completeTransaction(int tellerNumber) {

        if (tellerNumber < 1 || tellerNumber > 3) {

            System.out.println("Invalid teller number!");
            return;
        }

        int index = tellerNumber - 1;

        if (tellers[index] == null) {

            System.out.println("Teller " + tellerNumber +
                    " is already available.");

            return;
        }

        System.out.println("Teller " + tellerNumber +
                " completed " + tellers[index] +
                "'s transaction.");

        tellers[index] = null;

        assignNextCustomer(tellerNumber);
    }

    // Assign Next Customer
    public void assignNextCustomer(int tellerNumber) {

        if (!waitingQueue.isEmpty()) {

            String nextCustomer = waitingQueue.dequeue();

            int index = tellerNumber - 1;

            tellers[index] = nextCustomer;

            System.out.println(nextCustomer +
                    " is assigned to Teller " + tellerNumber + ".");
        }
    }

    // Display Status
    public void displayStatus() {

        System.out.println("\n---------- BANK STATUS ----------");

        for (int i = 0; i < tellers.length; i++) {

            System.out.print("Teller " + (i + 1) + ": ");

            if (tellers[i] == null) {

                System.out.println("Available");

            } else {

                System.out.println(tellers[i]);
            }
        }

        System.out.print("Waiting Queue: ");

        waitingQueue.display();

        System.out.println("---------------------------------");
    }
}
