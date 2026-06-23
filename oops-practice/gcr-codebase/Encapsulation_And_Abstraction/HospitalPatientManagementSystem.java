package ScenarioBasedProblemsOOPs.Encapsulation_And_Abstraction;

abstract class Patient{
    private int patientId; private String name; private int age;
    public Patient(int id,String n,int a){patientId=id;name=n;age=a;}
    public abstract double calculateBill();
    public void displayPatientDetails(){System.out.println(patientId+" "+name+" "+age);}
}
class InPatient extends Patient{
    private double roomCharges,treatmentCharges;
    public InPatient(int i,String n,int a,double r,double t){super(i,n,a);roomCharges=r;treatmentCharges=t;}
    public double calculateBill(){return roomCharges+treatmentCharges;}
}
class OutPatient extends Patient{
    private double consultationFees,treatmentCharges;
    public OutPatient(int i,String n,int a,double c,double t){super(i,n,a);consultationFees=c;treatmentCharges=t;}
    public double calculateBill(){return consultationFees+treatmentCharges;}
}
public class HospitalPatientManagementSystem{
    public static void main(String[] args){
        Patient p1=new InPatient(1,"Raj",40,5000,3000);
        Patient p2=new OutPatient(2,"Asha",30,500,1500);
        System.out.println(p1.calculateBill());
        System.out.println(p2.calculateBill());
    }
}