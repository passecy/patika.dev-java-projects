


import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
       int x,y;
       double z=Double.POSITIVE_INFINITY;
       double p=Double.NEGATIVE_INFINITY;



       Scanner inp=new Scanner(System.in);

       System.out.println("Number of integers:");
       x=inp.nextInt();

       int i=1;
       while (i<x+1){
           System.out.println("Number "+i+":");
           y=inp.nextInt();


           if (y>p) {
               p=y;



           }

           if(y<z){
               z=y;
           }





           i=i+1;
       }
       System.out.println("Min value you entered:"+z);
       System.out.println("Max value you entered:"+p);









    }
}


