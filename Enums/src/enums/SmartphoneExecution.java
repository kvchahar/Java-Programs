package enums;

import java.util.Arrays;

public class SmartphoneExecution {
    public static void main(String[] args) {
        BatteryChargeLevel currentBatteryLevel = BatteryChargeLevel.CRITICAL;
        System.out.println(currentBatteryLevel.name());
        System.out.println(currentBatteryLevel.ordinal());
        BatteryChargeLevel[] allLevels = BatteryChargeLevel.values();
       for( BatteryChargeLevel level : allLevels){
           System.out.println("Ordinal: " + level.ordinal() + ", Name: " + level.name() );
       }
        System.out.println(Seasons.MONSOON.name() + " " + Seasons.MONSOON.ordinal());

        System.out.println(currentBatteryLevel.getChargePercentage());
    }
}
