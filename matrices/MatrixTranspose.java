import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        int a,b;

        Scanner in =new Scanner(System.in);

        System.out.println("Enter the number of rows of the matrix:");
        a = in.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        b = in.nextInt();

        int[][] first = new int[a][b];
        int[][] transpose= new int[b][a];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.println((i+1)+"'th row "+(j+1)+"'th column:");
                first[i][j] = in.nextInt();

            }
        }
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                transpose[j][i]=first[i][j];

            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print(first[i][j]+" ");


            }
            System.out.println("");
        }

        System.out.println("Transpose matrix:");
        for (int i = 0; i < b; i++){
            for (int j = 0; j < a; j++){
                System.out.print(transpose[i][j]+" ");


            }
            System.out.println("");
        }
    }
}















