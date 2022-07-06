
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
       int x,y,z,p;
       z=0;
       p=0;


       Scanner inp=new Scanner(System.in);

       System.out.println("X:");
       x=inp.nextInt();

       System.out.println("Y:");
       y=inp.nextInt();


       int i=1;
       while (i<y+1){

           if ((x%i==0)&&(y%i==0)) {
               z=i;

           }
           i=i+1;
       }


       int t=1;
       while (t<x*y+1){

           if((t%x==0)&&(t%y==0)){
               p=t;
               break;

           }




           t=t+1;
       }




       System.out.println("Largest common factor:"+z);
       System.out.println("Least common multiple:"+p);







    }
}


