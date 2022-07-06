import java.util.Scanner;
import java.lang.Math;
class Scratch {
    public static void main(String[] args) {
        double a,b,c,cost;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the travelled road(Km):");
        a=input.nextInt();
        b=10;
        c=a*2.2;

        cost=(c<20)? 20:b+c;

        System.out.println("Cost of the taxi:"+cost);








        
    }
}
