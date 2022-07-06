import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        double a,b,BMI;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your height(in meters):");
        a=input.nextDouble();

        System.out.println("Please enter your mass:");
        b=input.nextInt();

        BMI=b/(a*a);


        System.out.println("Your BMI:"+BMI);









        
    }
}
