package bank;

public class Bank {
    private static int customerIDs = 1;
    private static final double OPENING_BALANCE = 0.0;
    private Customer customer;

    public void openAccount(String name) {
        customer = new Customer();
        customer.setId(customerIDs);
        customer.setName(name);
        Account account = new Account(customerIDs, 10_000.0);
        customer.setAccount(account);
    }

    public void withdrawMoney(double amount, int accountID) throws InvalidAccountDetailsException {
        if(this.customer.getAccount().getId()!=accountID){
            throw new InvalidAccountDetailsException("Account ID is not Valid");
        }
        if (this.customer.getAccount().getBalance() < amount) {
            try {
                throw new NotEnoughBalanceException("Not Enough Balance.");
            } catch (NotEnoughBalanceException notEnoughBalanceException) {
                System.err.println(notEnoughBalanceException.getMessage());
            }
        }
        final double currentBalance = this.customer.getAccount().getBalance();
        this.customer.getAccount().setBalance(currentBalance-amount);
        System.out.println("New Account Balance: " + this.customer.getAccount().getBalance());
    }
}