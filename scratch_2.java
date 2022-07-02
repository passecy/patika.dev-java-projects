import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        int math,physic,turkish,music,chemistry,total,total1;
        double average;
        Scanner input=new Scanner(System.in);

        total=0;
        total1=0;

        System.out.println("Please enter your math grade:");
        math=input.nextInt();
        if ((math<101)&&(math>-1)){

            total=total+1;
            total1=total1+math;

        }

        System.out.println("Please enter your physic grade:");
        physic=input.nextInt();
        if ((physic<101)&&(physic>-1)){

            total=total+1;
            total1=total1+physic;

        }

        System.out.println("Please enter your music grade:");
        music=input.nextInt();
        if ((music<101)&&(music>-1)){

            total=total+1;
            total1=total1+music;

        }

        System.out.println("Please enter your chemistry grade:");
        chemistry=input.nextInt();
        if ((chemistry<101)&&(chemistry>-1)){

            total=total+1;
            total1=total1+chemistry;

        }

        System.out.println("Please enter your turkish grade:");
        turkish=input.nextInt();
        if ((turkish<101)&&(turkish>-1)){

            total=total+1;
            total1=total1+turkish;

        }

        average=total1/total;

        if (average<55){
            System.out.println("Average:"+average);
            System.out.println("You have failed.");


        }else{
            System.out.println("Average:"+average);
            System.out.println("You have been successful in this semester");
        }




        
    }
}