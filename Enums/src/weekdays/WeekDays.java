package weekdays;

import java.util.Scanner;

enum WeekDays {
    SUNDAY(0),
    MONDAY(5),
    TUESDAY(4),
    WEDNESDAY(5),
    THURSDAY(6),
    FRIDAY(5),
    SATURDAY(0);

    private final int numberOfLectures;
    WeekDays(int numberOfLectures){
        this.numberOfLectures = numberOfLectures;
    }

    public int getNumberOfLectures() {
        return numberOfLectures;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the current day of week: ");
        Scanner scanner = new Scanner(System.in);
        String weekDay = scanner.nextLine().trim().toUpperCase();
        scanner.close();
        System.out.println("You have entered \"" + weekDay + "\"!");
        if(weekDay.equals(WeekDays.MONDAY.name())){
            System.out.println("Today is a Monday! ");
        }
        WeekDays currentDay = WeekDays.valueOf(weekDay);
        switch (currentDay){
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
                System.out.println("You have " + WeekDays.SUNDAY.getNumberOfLectures()+"lectures on " + WeekDays.SUNDAY.name().toLowerCase());
        }
    }
}
