package bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.openAccount("Krishnaveer");
        try {
            bank.withdrawMoney(1200, 4);
        } catch (InvalidAccountDetailsException exception) {
            System.err.println("Please check your account ID");
        }
    }
}
