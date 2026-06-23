package ScenarioBasedProblemsOOPs.Encapsulation_And_Abstraction;

abstract class FoodItem{
    private String itemName; private double price; private int quantity;
    public FoodItem(String n,double p,int q){itemName=n;price=p;quantity=q;}
    public double getPrice(){return price;} public int getQuantity(){return quantity;}
    public abstract double calculateTotalPrice();
    public void displayItemDetails(){System.out.println(itemName+" "+price+" "+quantity);}
}
class VegItem extends FoodItem{
    public VegItem(String n,double p,int q){super(n,p,q);}
    public double calculateTotalPrice(){return getPrice()*getQuantity();}
}
class NonVegItem extends FoodItem{
    private double serviceCharge=50;
    public NonVegItem(String n,double p,int q){super(n,p,q);}
    public double calculateTotalPrice(){return getPrice()*getQuantity()+serviceCharge;}
}
public class OnlineFoodDeliverySystem{
    public static void main(String[] args){
        FoodItem v=new VegItem("Paneer",200,2);
        FoodItem nv=new NonVegItem("Chicken",300,2);
        System.out.println(v.calculateTotalPrice());
        System.out.println(nv.calculateTotalPrice());
    }
}