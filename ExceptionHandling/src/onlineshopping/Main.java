package onlineshopping;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "KV", 100.0, "XYZ");
        Item item = new Item(5, "ABC", "DEF", 155.0, 0.0, true);
        ShoppingWebsite amakart = new ShoppingWebsite();
        try {
            amakart.purchaseItem("ABC");
        } catch (ItemOutOfStockException | InsufficientBalanceException e) {
            e.printStackTrace();
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}

