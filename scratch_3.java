
import java.util.Objects;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int year;


        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the year:");
        year=input.nextInt();

        if ((year%4==0)&&(year%100!=0)){

            System.out.println("Leap year");


        }

        else if((year%100==0)&&(year%400==0)){
            System.out.println("Leap year");
        }

        else{
            System.out.println("Not leap year");
        }



    }
}


