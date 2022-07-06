import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Value:");
        a = input.nextInt();

        System.out.println(sum(a, a));


    }

    public static int sum(int a, int b) {
        Scanner input = new Scanner(System.in);

        if (a > 0) {


            System.out.print(a+" ");
            a = a - 5;
            return sum(a, b);

        } else {
            return sum1(a, b);

        }
    }

    public static int sum1(int a, int b) {
        if (a < b) {

            System.out.print(a+" ");
            a = a + 5;
            return sum1(a, b);
        } else {
            return b;
        }
    }
}







