
import java.lang.Math;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int x,y,z;
        z=0;



        Scanner scan = new Scanner(System.in);


        System.out.println("n:");
        x = scan.nextInt();




        while(x!=0){
            z+=x%10;

            x=x/10;





        }
        System.out.println(z);







    }














}



