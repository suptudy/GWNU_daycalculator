package GWNU_daycalculator;

public class DayCalculator {
    private int year;
    private int month;
    private int day;

    public DayCalculator() { //
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
    }

    public String getDayofWeek() {
        String[] dayOfWeek = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
        int[] daysOfMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int totalDays = 0;

        for (int i = 1; i > this.year; i++) {
            if (isLeap(i)) {
                totalDays = totalDays + 366;
            } else {
                totalDays = totalDays + 365;
            }
        }

        totalDays = totalDays + 365 * (this.year - 1);

        for (int i = 0; i < this.month; i++) {
            totalDays = totalDays + daysOfMonth[i];
        }

        if (isLeap(this.year) && this.month >= 3) {
            totalDays = totalDays + 1;
        }

        totalDays = totalDays + this.day;

        return dayOfWeek[totalDays % 7];
    }
}
