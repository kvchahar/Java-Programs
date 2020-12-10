package enumpractice;

interface Demo1{

}
enum Mobile1 { // enum can implements a interface but not extends classes.
    SAMSUNG(199), APPLE(200), REDMI(123);
    int price;

    Mobile1() {
        price = 80;
        System.out.println("Constructor");
    }
    Mobile1(int p){
        price = p;
    }
    public int getPrice() {
        return price;
    }
}

public class EnumDemo1 {
    public static void main(String[] args) {
        Mobile1[] m1 = Mobile1.values();
        for(Mobile1 mobile1 : m1){
            System.out.println(mobile1);
        }
    }
}
