


import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int x;






        Scanner klavye = new Scanner(System.in);
        System.out.println("Value:");
        int n = klavye.nextInt();


        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        for (int i = 0; i <= n ; i++) {
            if (i == 0) {
                continue;

            }
            for (int j = 0; j < (i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * (n-i) + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}

















