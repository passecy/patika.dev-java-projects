
import java.util.Objects;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int distance,type,age,cost;


        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the distance of your travel:");
        distance=input.nextInt();

        cost=distance/10;


        System.out.println("Type '1' for one way ticket\nType'2' for round-trip ticket:");
        type=input.nextInt();

        System.out.println("Please enter your age:");
        age=input.nextInt();

        if (((type!=1)&&(type!=2))||(age<1)||(distance<0)){
            System.out.println("Error!");

        }
        else{
            if (age<12){
                cost=cost/2;

            }
            else if (age<24) {
                cost=cost*9/10;

            }
            else if (age>65) {
                cost=cost*7/10;


            }

            if
            (type==2){
                cost=2*(cost*8/10);

            }

            System.out.println("Total cost: "+cost+" Dollars");




            }





    }


}
