import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = SafeInput.getRangedInt(scan, "Enter your birth month number", 1, 12);
        int year = SafeInput.getRangedInt(scan, "Enter your birth year", 1950, 2015);
        int maxDays;
        switch(month) {
            case 2:
                if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    maxDays = 29;
                } else {
                    maxDays = 28;
                }
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
        }
        int day = SafeInput.getRangedInt(scan, "Enter your birth day", 1, maxDays);
        int hours = SafeInput.getRangedInt(scan, "Enter your birth hour", 1, 24);
        int minutes = SafeInput.getRangedInt(scan, "Enter your birth minute", 1, 59);
        System.out.printf("You were born on %d/%d/%d at %02d:%02d.%n", month, day, year, hours, minutes);

    }
}
