
import java.lang.Math;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int x;

        Scanner scan = new Scanner(System.in);


        System.out.println(" Upper limit:");
        x = scan.nextInt();

        for (int i = 1; i <x ; i++) {
            double number=Math.pow(4,i);
            double number1=Math.pow(5,i);

            System.out.println(number+" "+number1);


        }



    }














}



