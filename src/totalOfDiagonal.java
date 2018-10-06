package src;

import java.util.Scanner;

public class totalOfDiagonal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a size of your square matrix");
            int n = sc.nextInt();
        double[][] yourMatrix = createNewMatrix(n);
        enterData(sc,yourMatrix,n);
        System.out.println("Your sum is " + totalDiagonal(yourMatrix,n));

    }
    public static double[][] createNewMatrix(int n){
        double[][] matrix = new double[n][n];
        return matrix;
    };
    public static void enterData(Scanner scan,double[][] matrix,int n){
        System.out.println("Enter Matrix Data");
        for(int i = 0;i < n; i++){
            System.out.println("Row " + i);
            for (int j = 0; j < n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
    }
    public static double totalDiagonal(double[][] matrix, int n){
        double sum = 0;
        for(int i = 0; i < n;i++){
            for (int j = 0;j < n;j++){
                if(i == j){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
