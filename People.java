package Lip;

public class People {
    private String fisrtname;
    private String lastname;
    protected MyDate birthdate = new MyDate();
    
    public String getFirstname(){
        return this.fisrtname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getName(){
        return this.fisrtname+" "+this.lastname;
    }
    public MyDate getBirthdate(){
        return this.birthdate;
    }
    public void setFirstname(String first){
        this.fisrtname = first;
    }
    public void setLastname(String last){
        this.lastname = last;
    }
    public void setName(String first, String last){
        this.setFirstname(first);
        this.setLastname(last);
    }
    public void setBirthdate(int day,int month,int year){
        this.birthdate.setDate(day, month, year);
    }
    public String toString(){
        String n = "My name is "+this.fisrtname+" "+this.lastname+".\nI was born on "+this.birthdate.toString()+"."; 
        return n;
    }
}