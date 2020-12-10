package enums;

public class Execution {
    public static void main(String[] args) {
        Seasons currentSeason = Seasons.WINTER;
        System.out.println(currentSeason);
        currentSeason = Seasons.valueOf("SUMMER");
        System.out.println(currentSeason.name());
    }
}
