package onlineshopping;

public class Customer {
    private int id;
    private String name;
    private double walletBalance;
    private String address;

    public Customer(int id, String name, double walletBalance, String address) {
        this.id = id;
        this.name = name;
        this.walletBalance = walletBalance;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public String getAddress() {
        return address;
    }
}
