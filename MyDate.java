package Lip;

public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public int getDay(){
        return this.day;
    }
    public int getMont(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setDay(int day){
        if (day>0 && day<=31)
            this.day=day;
        else
            System.out.println("Cant set day.");
    }
    public void setMonth(int month){
        if(month>0 && month<=12)
            this.month=month;
        else
            System.out.println("Cant set month");
    }
    public void setYear(int year){
        if(year>=0 && year<=2566)
            this.year=year;
        else
            System.out.println("Cant se year");
    }
    public void setDate(int day, int month, int year){
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }
    public String toString(){
        String s = this.getDay()+"/"+this.getMont()+"/"+this.getYear();
        return s;
    }
        
}