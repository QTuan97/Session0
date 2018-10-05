package src.LocationClass;

import java.util.Scanner;

public class createMatrix {
    public int Rows,Cols;
    public double Max;

    public double[][] createNewMatrix(int Rows,int Cols){
        this.Rows = Rows;
        this.Cols = Cols;
        double[][] matrix = new double[Rows][Cols];
        return matrix;
    };

    public static double[] locateLargest(double[][] matrix){
        double[] result = {1,1,0};
        double max = matrix[0][0];
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
