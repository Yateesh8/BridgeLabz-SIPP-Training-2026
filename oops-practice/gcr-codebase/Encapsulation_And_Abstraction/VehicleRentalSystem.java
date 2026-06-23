package ScenarioBasedProblemsOOPs.Encapsulation_And_Abstraction;

abstract class Vehicle{
    private String vehicleNumber, vehicleType;
    public Vehicle(String n,String t){vehicleNumber=n;vehicleType=t;}
    public String getVehicleNumber(){return vehicleNumber;}
    public String getVehicleType(){return vehicleType;}
    public abstract double calculateRentalCost(int days);
}
class Car extends Vehicle{
    private double dailyRate;
    public Car(String n,double r){super(n,"Car");dailyRate=r;}
    public double calculateRentalCost(int d){return d*dailyRate;}
}
class Bike extends Vehicle{
    private double dailyRate;
    public Bike(String n,double r){super(n,"Bike");dailyRate=r;}
    public double calculateRentalCost(int d){return d*dailyRate;}
}
class Truck extends Vehicle{
    private double dailyRate,loadingCharge;
    public Truck(String n,double r,double l){super(n,"Truck");dailyRate=r;loadingCharge=l;}
    public double calculateRentalCost(int d){return d*dailyRate+loadingCharge;}
}
public class VehicleRentalSystem{
    public static void main(String[] args){
        System.out.println(new Car("C1",1000).calculateRentalCost(3));
        System.out.println(new Bike("B1",300).calculateRentalCost(3));
        System.out.println(new Truck("T1",2000,500).calculateRentalCost(3));
    }
}