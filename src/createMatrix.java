package src;
import java.util.Scanner;
public class createMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        int[][] matrix = new int[n][n];
        enterMatrixData(matrix,n);
        printMatrix(matrix,n);
    }
    public static void enterMatrixData(int[][] matrix,int n){
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = (int)(Math.random() * 2) + 0;
            }
        }
    }
    public static void printMatrix(int[][] matrix, int n){
        System.out.println("Your Matrix is : ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }

            System.out.println();
        }
    }
}
