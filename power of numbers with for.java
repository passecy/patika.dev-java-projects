
import java.lang.Math;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int x,y;
        int total=1;

        Scanner scan = new Scanner(System.in);


        System.out.println("n:");
        x = scan.nextInt();
        System.out.println("r:");
        y = scan.nextInt();

        for (int i = 0; i <y; i++) {
            total=total*x;


        }

        System.out.println(total);







    }














}



