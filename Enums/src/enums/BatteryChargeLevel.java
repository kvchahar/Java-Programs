package enums;

public enum BatteryChargeLevel {
    FULL(100, 5),
    HIGH(75, 3),
    MEDIUM(50, 3),
    LOW(25, 2),
    VERY_LOW(10, 1),
    CRITICAL(5, 0);

    int chargePercentage;
    int sections;

    BatteryChargeLevel(int chargePercentage, int sections) {
        this.chargePercentage = chargePercentage;
        this.sections = sections;
    }

    public int getChargePercentage() {
        return chargePercentage;
    }

    public int getSections() {
        return sections;
    }
    public static void method(){

    }
}
