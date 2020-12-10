package switchdemo;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Dukd Choice Shop");
        Customer c1 = new Customer();
        c1.name = "Krishnaveer";
        c1.size = "S";
        System.out.println("Customer is : " + c1.name);
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        item1.description = "Blue Shirt";
        item1.price = 20.9;
        item1.size = "H";
        item2.description = "Orange Shirt";
        item2.price = 10.5;
        item2.size = "S";
        System.out.println("Item 1" + "," + item1.description + "," + "," + item1.price + "," + item1.size);
        System.out.println("Item 2" + "," + item2.description + "," + "," + item2.price + "," + item2.size);
        int measurement = 3;
        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5, 6:
                c1.size = "H";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }
    }
}
