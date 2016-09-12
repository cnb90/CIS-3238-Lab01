package cis3238_lab01;

/**
 *
 * @author tuf11938
 */
public class MyDate {
    private int year;
    private int month;
    private int day;
    
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int daysTo(MyDate d2){
        int diff = 0;
        int diff_years = 0;
        int diff_months = 0;
        int diff_days = 0;
        
        diff_years = d2.getYear() - this.getYear();
        diff_months = d2.getMonth() - this.getMonth();
        diff_days = d2.getDay() - this.getDay();
        
        diff = Math.abs((diff_years * 365) + (diff_months * 30) + diff_days);
        
        return diff;
    }
    
    public int getYear(){
        return year;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDay(){
        return day;
    }
    
}
