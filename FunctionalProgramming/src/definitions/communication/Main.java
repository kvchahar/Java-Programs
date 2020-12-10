package definitions.communication;

public class Main {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile(1, "ABC", "DEF", 30_000.0);
        System.out.println(mobile1);
        Mobile mobile2 = new Mobile(2, "XYZ", "GHI", 20_000.0);
        System.out.println(mobile2);
        // mobile1 < mobile2
        if (mobile1.compareTo(mobile2) < 0) {
            System.out.println("price of mobile1 is less than mobile2.");
        } else if(mobile1.compareTo(mobile2)>0){
            System.out.println("price of mobile2 is less than mobile1.");
        }
        else if(mobile1.compareTo(mobile2)==0){

        }
    }
}
