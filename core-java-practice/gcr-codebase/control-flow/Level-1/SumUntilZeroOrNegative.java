import java.util.*;
public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0;
        while(true){
            double n=sc.nextDouble();
            if(n<=0) break;
            total+=n;
        }
        System.out.println("Total = "+total);
    }
}