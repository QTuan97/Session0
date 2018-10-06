package src;

import java.util.Scanner;

public class totalOfNumInCol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of rows");
        int Rows = scan.nextInt();
        System.out.println("Enter a number of collums");
        int Cols = scan.nextInt();
        System.out.println("Enter a number of collum to get total");
        int num = scan.nextInt();
        double[][] yourMatrix = createNewMatrix(Rows,Cols);
        enterData(scan,yourMatrix,Rows,Cols);
        System.out.println(sumOfSameCol(yourMatrix,Rows,Cols,num));

    }
    public static double[][] createNewMatrix(int Rows,int Cols){
        double[][] matrix = new double[Rows][Cols];
        return matrix;
    };
    public static void enterData(Scanner scan,double[][] matrix, int Rows, int Cols){
        System.out.println("Enter Matrix Data");
        for(int i = 0;i < Rows; i++){
            System.out.println("Row " + i);
            for (int j = 0; j < Cols; j++){
                matrix[i][j] = scan.nextDouble();
            }
        }
    }
    public static double sumOfSameCol (double[][] matrix,int Rows, int Cols,int num){
        double sum = 0;
        for(int i = 0;i < Rows; i++){
            for(int j = 0;j < Cols; j++){
                if(j == num) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }
}
