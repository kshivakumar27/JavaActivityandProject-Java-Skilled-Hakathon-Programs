public class EmployeeMain{
public static void main(String args[]){

Employee sc=new Employee();
//sc.name="shiv";
//sc.address="mysure";
//sc.mobile="8722748066";

sc.displayInfo();


System.out.println("Employee Details: ");
System.out.println("name: "+sc.getName());
System.out.println("Address: "+sc.getAddress());
System.out.println("Mobileno: "+sc.getMobile());
}
}
