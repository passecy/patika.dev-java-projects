import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        if (a<2){
            System.out.println("not prime number");
        }
        else{
            System.out.println(power(a,a));


        }


    }

    public static String power(int a, int b) {
        Scanner input = new Scanner(System.in);

        if (a > 2) {
            a = a - 1;
            if (b%a!=0){
                return power(a,b);

            }
            else{
                return "not a prime number";
            }


        }else {
            return "prime number";
        }


    }
}
