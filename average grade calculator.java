

import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int mat, physic, chemistry, turkish, history, music;


        Scanner inp = new Scanner(System.in);

        System.out.print("Mat Grade:");
        mat = inp.nextInt();

        System.out.print("Physic Grade:");
        physic = inp.nextInt();

        System.out.print("Chemistry Grade:");
        chemistry = inp.nextInt();

        System.out.print("Turkish Grade:");
        turkish = inp.nextInt();

        System.out.print("History Grade:");
        history = inp.nextInt();

        System.out.print("Music Grade:");
        music = inp.nextInt();

        int sum=mat+physic+chemistry+turkish+history+music;
        double result = sum/6;
        String a = (result<60) ? "Can not pass the exam":"Pass the exam";
        System.out.println( a);




    }
}


