


import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
       int x,y;
       y=0;




       Scanner inp=new Scanner(System.in);

       System.out.println("Number:");
       x=inp.nextInt();

        for (int i = 1; i <x; i++) {
            if (x%i==0) {

                y=y+i;


            }

        }
        if (y==x){
            System.out.println("Perfect number.");
        }else {
            System.out.println("Not a perfect number.");
        }


    }
}


