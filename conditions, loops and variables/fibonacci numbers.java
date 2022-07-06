


import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {

        int a,b,c;
        a=0;
        b=1;
        c=0;


        Scanner input = new Scanner(System.in);
        System.out.println("Value:");
        int n = input.nextInt();


        switch (n){
            case 1:
                System.out.print(0);
                break;

            case 2:
                System.out.print("0 1");
                break;

            case 3:
                System.out.print("0 1 1");
                break;
            default:


                for (int i = 0; i <n; i++) {
                    if(i==2){
                        System.out.print(1+" ");
                    }
                    System.out.print(c+" ");
                    c=a+b;
                    a=b;
                    b=c;

                }
        }
    }
}



