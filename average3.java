
import java.util.Objects;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int k,x,y;
        x=0;
        y=0;



        Scanner input=new Scanner(System.in);

        System.out.println("Number:");
        k=input.nextInt();

        for (int i = 1; i <k ; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                x = x + i;
                y = y + 1;


            }
        }

        if ( y==0 ) {
            System.out.println("None");
        }
        else{
            System.out.println(x/y);
        }




    }








}



