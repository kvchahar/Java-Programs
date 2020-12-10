package onlineshopping;

public class Item {
    private int id;
    private String name;
    private String companyName;
    private double price;
    private double discount;
    private boolean isInStock;

    public Item(int id, String name, String companyName, double price, double discount, boolean isInStock) {
        this.id = id;
        this.name = name;
        this.companyName = companyName;
        this.price = price;
        this.discount = discount;
        this.isInStock = isInStock;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public boolean isInStock() {
        return isInStock;
    }
}
