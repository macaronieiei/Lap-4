package Lip;

public class Employee extends People {
    private String company;
    private double salary;
    
    public String getCompany(){
        return this.company;
    }
    public double getSalary(){
        if (salary<=0) 
            System.out.println("Cant set salary.");
        return this.salary;
    }
    public void setCompany(String c){
        this.company = c;
    }
    public void setSalary(double s){
        this.salary = s;
    }
    public boolean Taxpay(){
        if(salary*12 > 200000)
        return true;
        else
        return false;
    }
    public void Show(){
        System.out.println("I'm "+this.getFirstname()+" "+this.getLastname()+".\nI work for "+this.company);
    
}
}