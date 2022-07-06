


import java.util.Scanner;
public class palindromic_numbers{
    static String Palindrom(int number){
        int temp=number, reversenumber = 0, lastnumber;

        while (temp!=0){
            lastnumber=temp%10;
            reversenumber=(reversenumber*10)+lastnumber;
            temp=temp/10;

        }
        if (number ==reversenumber) {
            return (number+" is a palindromic number");

        }else {
            return (number+" is not a palindromic number");
        }


    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.print("number:");
            int a=input.nextInt();
            if (a==0){
                break;

            }
            System.out.println(Palindrom(a));
            System.out.println("\n*************************\n");


        }


    }








}




