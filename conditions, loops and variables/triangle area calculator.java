import java.util.Scanner;
import java.lang.Math;
class Scratch {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the length of the first side:");
        a=input.nextInt();

        System.out.println("Please enter the length of the second side:");
        b=input.nextInt();

        System.out.println("Please enter the length of the third side:");
        c=input.nextInt();

        double area;

        d=(a+b+c)/2;

        area=Math.sqrt(d*(d-a)*(d-b)*(d-c));

        System.out.println("Area of the triangle:"+area);



        
    }
}
