package src.LocationClass;

import java.util.Scanner;

public class createMatrix {
    public int Rows,Cols;
    public double Max;

    public int[][] createNewMatrix(int Rows,int Cols){
        this.Rows = Rows;
        this.Cols = Cols;
        int[][] matrix = new int[Rows][Cols];
        return matrix;
    };

    public static int[] locateLargest(int[][] matrix){
        int[] result = {1,1,0};
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        result[2] = max;
        return result;
    }
}
