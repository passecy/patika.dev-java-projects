import java.util.Arrays;
import java.util.Scanner;
public class mintomax{
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
        System.out.println(Arrays.toString(a));


    }


}