package enumpractice.switchstatment;

enum Mobile {
    SAMSUNG(100), APPLE(500), HTC(50);
    int price;

    public int getPrice() {
        return price;
    }

    Mobile() {
        price = 80;
        System.out.println("Constructor");
    }
    Mobile(int p){
        price = p;
    }
}

public class EnumWithSwitch {
    public static void main(String[] args) {
        Mobile m = Mobile.SAMSUNG;
        System.out.println(Mobile.APPLE.getPrice());

        switch (m) {
            case APPLE:
                System.out.println("Apple is best");
                break;
            case SAMSUNG:
                System.out.println("1st a copy of Apple");
                break;
        }
    }
}
