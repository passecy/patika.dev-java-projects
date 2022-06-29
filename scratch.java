

import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first number:");
        n1 = input.nextInt();
        System.out.print("Please enter the second number:");
        n2 = input.nextInt();

        System.out.println("1-Summation\n2-Subtraction\n3-Multiply\n4-Division");
        System.out.println("Please choose your operation:");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                System.out.println(n1/n2);
                break;
            default:
                break;
        }






    }
}


