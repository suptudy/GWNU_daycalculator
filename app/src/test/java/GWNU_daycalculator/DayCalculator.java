package GWNU_daycalculator;

public class DayCalculator {
    private int year;
    private int month;
    private int day;

    public DayCalculator() {
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

    public String getDayofWeek() {
        String[] dayOfWeek = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };
        int[] daysOfMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int totalDays = 0;

        for (int i = 0; i < this.month; i++) {
            totalDays = totalDays + daysOfMonth[i];
        }
        totalDays = totalDays + this.day;

        return dayOfWeek[totalDays % 7];
    }
}
