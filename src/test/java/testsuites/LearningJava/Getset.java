package testsuites.LearningJava;

public class Getset {
    private int day;
    private int month;
    private int year;

    public Getset(int day, int month, int year) {
        if (day>=1 && day<=31){
            this.day = day;
        }else {
            this.day=1;
        }
        if (month>=1 && month<=12){
            this.month = month;
        }else {
            this.month = 1;
        }
        if (year>=999 && year<=9999){
        this.year = year;
        }
        else {
            this.year = 1999;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day>=1 && day<=31){
            this.day = day;
        }
        else {
          this.day=1;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Getset{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
