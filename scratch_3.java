import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int heat;
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter the value of the heat:");
        heat=input.nextInt();

        if(heat<5){
            System.out.println("I recommend Skiing ");

        } else if (heat<15) {
            System.out.println("I recommend Going to the Cinema ");

        } else if (heat<25) {
            System.out.println("I recommend Hiking");

            
        } else {
            System.out.println("I recommend swimming");

        }
    }
}