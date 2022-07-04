

import java.lang.Math;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int x;
        double y,z;
        z=0.0;



        Scanner scan = new Scanner(System.in);


        System.out.println("n:");
        x = scan.nextInt();


        for (double i = 1; i < x+1 ; i++) {
            y=(1/i);
            z=z+y;

        }

        System.out.println(z);







    }














}



