package src.LocationClass;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of rows");
        int Rows = scan.nextInt();
        System.out.println("Enter a number of collums");
        int Cols = scan.nextInt();
        createMatrix matrix = new createMatrix();
        double[][] yourmatrix = matrix.createNewMatrix(Rows,Cols);
        enterData(scan,yourmatrix,matrix.Rows,matrix.Cols);
        double[] result = matrix.locateLargest(yourmatrix);
        System.out.println("Your largest number is " + result[2] +
                " at row " + (int)result[0] + " and column " + (int)result[1] );
    }
    public static void enterData(Scanner scan,double[][] matrix, int Rows, int Cols){
        System.out.println("Enter Matrix Data");
        for(int i = 0;i < Rows; i++){
            System.out.println("Row " + i);
            for (int j = 0; j < Cols; j++){
                matrix[i][j] = scan.nextDouble();
            }
        }
    }
}
