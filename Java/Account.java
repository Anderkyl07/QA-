public class Account {
    double balance;

    void debit(double amount) {

        if (balance < amount) {
            System.out.println("Cant debit more that " + balance);
        } else {

            balance = balance - amount;

        }
    }
}