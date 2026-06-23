package ScenarioBasedProblemsOOPs.Encapsulation_And_Abstraction;

abstract class Employee{
    private int employeeId; private String employeeName;
    public Employee(int id,String name){employeeId=id;employeeName=name;}
    public int getEmployeeId(){return employeeId;} public void setEmployeeId(int id){employeeId=id;}
    public String getEmployeeName(){return employeeName;} public void setEmployeeName(String n){employeeName=n;}
    public abstract double calculateSalary();
    public void displayEmployeeInfo(){System.out.println(employeeId+" "+employeeName);}
}
class FullTimeEmployee extends Employee{
    private double monthlySalary;
    public FullTimeEmployee(int id,String n,double s){super(id,n);monthlySalary=s;}
    public double calculateSalary(){return monthlySalary;}
}
class PartTimeEmployee extends Employee{
    private int hoursWorked; private double hourlyRate;
    public PartTimeEmployee(int id,String n,int h,double r){super(id,n);hoursWorked=h;hourlyRate=r;}
    public double calculateSalary(){return hoursWorked*hourlyRate;}
}
public class EmployeePayrollSystem{
    public static void main(String[] args){
        Employee e1=new FullTimeEmployee(1,"John",50000);
        Employee e2=new PartTimeEmployee(2,"Sam",80,300);
        e1.displayEmployeeInfo(); System.out.println(e1.calculateSalary());
        e2.displayEmployeeInfo(); System.out.println(e2.calculateSalary());
    }
}