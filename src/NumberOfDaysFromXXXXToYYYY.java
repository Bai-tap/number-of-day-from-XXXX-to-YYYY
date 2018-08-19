import java.util.Scanner;

public class NumberOfDaysFromXXXXToYYYY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start year: ");
        int yearStart = sc.nextInt();
        System.out.println("Enter end year: ");
        int yearEnd = sc.nextInt();

        int days = numberOfDayFromStartYearToEndYear(yearStart, yearEnd);
        System.out.println("The numbers of day from " + yearStart + " to " + yearEnd + " is: " + days);
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return leapYear = true;
                } else {
                    return leapYear = false;
                }
            } else {
                return leapYear = true;
            }
        } else return leapYear = false;
    }

    public static int theNumberOfDayInAYear(int year) {
        if (isLeapYear(year) == true) return 366;
        else return 365;
    }

    public static int numberOfDayFromStartYearToEndYear(int yearStart, int yearEnd) {
        int days = 0;
        for (int i = yearStart; i <= yearEnd; i++) {
            days += theNumberOfDayInAYear(i);
        }
        return days;
    }
}
