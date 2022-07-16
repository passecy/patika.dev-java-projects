


import java.util.Arrays;
import java.util.Scanner;
public class frequency{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Number of integers:");
        int n= input.nextInt();
        int[]a=new int[n];

        for (int i = 0; i <n; i++) {
            System.out.println((i+1)+"'th number:");
            int x=input.nextInt();
            a[i]=x;



        }
        Arrays.sort(a);

        int[]b=new int[1];

        for (int k : a) {
            int c = 0;
            for (int i : b) {
                if (k == i) {
                    c = c + 1;
                }

            }
            if (c == 0) {
                b = Arrays.copyOf(b, b.length + 1);
                b[b.length - 1] = k;


            }


        }
        int[] e = new int[b.length - 1];


        for (int i = 0, k = 0; i < b.length; i++) {


            if (i == 0) {
                continue;
            }


            e[k++] = b[i];



        }


        for(int j:e){
            int x=0;
            for (int k : a) {
                if (j == k) {
                    x = x + 1;

                }


            }
            System.out.println(x + " times " +"'"+j+"'");
        }
    }
}






