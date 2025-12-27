package Maths;


//Given a date, return the corresponding day of the week for that date.
//
//The input is given as three integers representing the day, month and year respectively.
//
//Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.
//
//Note: January 1, 1971 was a Friday.
//
//
//
//        Example 1:
//
//Input: day = 31, month = 8, year = 2019
//Output: "Saturday"
//Example 2:
//
//Input: day = 18, month = 7, year = 1999
//Output: "Sunday"
//Example 3:
//
//Input: day = 15, month = 8, year = 1993
//Output: "Sunday"
//
//
//Constraints:
//
//The given dates are valid dates between the years 1971 and 2100.
//


public class DayOfTheWeek {
    public static void main(String[] args) {
        int day = 15;
        int month = 8;
        int year = 1993;
        String dayOfWeek = dayOfTheWeek(day, month, year);
        System.out.println(dayOfWeek);
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;

        int f = day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j);
        int dayOfWeek = f % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[dayOfWeek];
    }

}


//public String dayOfTheWeek(int day, int month, int year) {
//    String[] days = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
//    int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//    int totalDays = 0;
//    for (int y = 1971; y < year; y++) {
//        totalDays += 365;
//        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
//            totalDays += 1;
//        }
//    }
//    for (int m = 0; m < month - 1; m++) {
//        totalDays += monthDays[m];
//        if (m == 1 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
//            totalDays += 1;
//        }
//    }
//    totalDays += day - 1;
//    return days[totalDays % 7];
//
//}