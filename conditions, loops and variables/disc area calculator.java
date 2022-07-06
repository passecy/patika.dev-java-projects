import java.util.Scanner;
import java.lang.Math;
class Scratch {
    public static void main(String[] args) {
        double a,b,c,area;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the value of the radius:");
        a=input.nextInt();

        System.out.println("Please enter the value of the angle:");
        b=input.nextInt();

        c=3.14;

        area=c*a*a*b/360;
        System.out.println("The area of the disc:"+area);









        
    }
}
