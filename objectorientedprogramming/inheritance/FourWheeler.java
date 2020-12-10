package objectorientedprogramming.inheritance;

public class FourWheeler extends Vehice {
    public static void main(String[] args) {
        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.setModelName("Audi");
        System.out.println(fourWheeler.getModelName());
    }

}
