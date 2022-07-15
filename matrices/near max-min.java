import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a;
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        Scanner input=new Scanner(System.in);
        a=input.nextInt();

        double min = Double.NEGATIVE_INFINITY;
        double max = Double.POSITIVE_INFINITY;

        for (int i : list) {
            if ((i < a)&&(min<i)) {
                min = i;
            }
            if ((i > a)&&(max>i)) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
}