import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        double cost;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter the coast:");
        cost=input.nextDouble();

        double tax= (cost<1000) ? 0.18*cost:0.08*cost;
        System.out.println("Tax:"+tax);
        double totalcost;
        totalcost=tax+cost;
        System.out.println("Total cost:"+totalcost);

        
    }
}
