import javax.swing.table.TableRowSorter;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("Number:");
            int b = input.nextInt();
            System.out.println("Power:");
            int a = input.nextInt();
            System.out.println("Result:"+power(b,a));
            System.out.println("*************************************");

        }




    }

    public static int power(int b,int a) {
        Scanner input = new Scanner(System.in);

        if (a > 0) {
            a = a - 1;
            return b * power(b,a);

        }else {
            return 1;
        }


    }
}
