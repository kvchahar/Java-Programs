package enums;

public class SmartphoneExecution2 {
    public static void main(String[] args) {
        BatteryChargeLevel currentBatteryLevel =
                BatteryChargeLevel.valueOf("MEDIUM");
        switch (currentBatteryLevel){
            case FULL:
                break;
            case HIGH:
                break;
            case MEDIUM:
                break;
            case LOW:
                break;
            case CRITICAL:
                break;
            case VERY_LOW:
                break;
        }
    }
}
