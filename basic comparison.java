

import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("First number:");
        a = input.nextInt();

        System.out.println("Second number:");
        b = input.nextInt();

        System.out.println("Third number:");
        c = input.nextInt();

        if ((a < c) && (a < b)) {
            if (b < c) {
                System.out.println("1<2<3");
            } else {
                System.out.println("1<3<2");
            }
        } else if ((b < c) && (b < a)) {
            if (a < c) {
                System.out.println("2<1<3");
            } else {
                System.out.println("2<3<1");
            }

        } else if ((c < a) && (c < b)) {
            if (b < a) {
                System.out.println("3<2<1");
            } else {
                System.out.println("3<1<2");
            }


        }
    }
}
