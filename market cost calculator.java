import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        double a,b,c,d,e,total,a1,b1,c1,d1,e1;
        a=2.14;
        b=3.67;
        c=1.11;
        d=0.95;
        e=5;
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter the number of milks you bought:");
        a1=input.nextInt();

        System.out.println("Please enter the number of chocolates you bought:");
        b1=input.nextInt();

        System.out.println("Please enter the number of beers you bought:");
        c1=input.nextInt();

        System.out.println("Please enter the number of gums you bought:");
        d1=input.nextInt();

        System.out.println("Please enter the number of chips you bought:");
        e1=input.nextInt();

        total=a*a1+b*b1+c*c1+d*d1+e*e1;

        System.out.println("Total cost that you need to pay to the market:"+total);











        
    }
}