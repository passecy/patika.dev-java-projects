
import java.lang.Math;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int x,y;

        Scanner scan = new Scanner(System.in);


        System.out.println("n:");
        x = scan.nextInt();
        System.out.println("r:");
        y = scan.nextInt();
        int total=1;
        int total1=1;

        for (int i =x-y+1; i <x+1; i++) {
            total=total*i;

        }
        for (int i = 1; i <y+1; i++) {
            total1=total1*i;

        }
        System.out.println(total/total1);







    }














}



