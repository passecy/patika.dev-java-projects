


import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {











        Scanner input = new Scanner(System.in);
        System.out.println("Value:");
        int n = input.nextInt();

        for (int i = 2; i <n; i++) {
            int a=0;
            for (int j = 1; j <i; j++) {
                if (i%j==0) {
                    a=a+1;


                }


                }if(a==1){
                System.out.print(i+" ");
            }
        }
    }
}



