
import java.util.Objects;
import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int x;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Number:");
            x = scan.nextInt();

            if(x%2==0){
                total=total+x;
            }

        }while(x%2!=1);

        System.out.println("Total:"+total);

    }














}



