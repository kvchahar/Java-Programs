package onlineshopping;

public class ShoppingWebsite {
    private int id;
    private String name;
    // we want to store many objects for the item that this website is selling
    private Item[] items;
    private Customer customer;

    // Exception Scenarios
    // 1. Item out of stock
    // Customer Wallet Balance is not sufficient

    public void purchaseItem(String itemName) throws InsufficientBalanceException, ItemOutOfStockException {
        if (items[0].isInStock()) {
            System.out.println("Thank you, " + customer.getName());
        } else {
            throw new ItemOutOfStockException(itemName + " is currently out of stock.");
        }
        if (customer.getWalletBalance() < items[0].getPrice()) {
           throw new InsufficientBalanceException("Please add money in your account");
    }
}
}