import Lip.Employee;

public class Main {

    public static void main(String[] args) {
        /*MyDate a = new MyDate();
        a.setDate(19, 12, 2566);
        System.out.println(a.toString());
    }*/
    /*People A = new People();
    A.setName("David", "Beckhem");
    A.setBirthdate(2, 5, 1975);
    System.out.println(A.toString());*/
    
    Employee J = new Employee();
    Employee K = new Employee();
    J.setName("Leonel", "Messi");
    J.setBirthdate(24, 6, 1987);
    J.setCompany("Argentina FC");
    J.setSalary(15000);

    K.setName("Cristino", "Ronaldo");
    K.setBirthdate(5, 2, 1985);
    K.setCompany("Portugal FC");
    K.setSalary(19000);

    if(J.Taxpay())J.Show();
    if(K.Taxpay())K.Show();

}
}