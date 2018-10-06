package src;
import java.util.Scanner;

public class addTwoSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of your matrix");
        int Rows = sc.nextInt();
        System.out.println("Enter cols of your matrix");
        int Colls = sc.nextInt();
        double[][] fristMatrix = createNewMatrix(Rows,Colls);
        double[][] secMatrix = createNewMatrix(Rows,Colls);
        System.out.println("Enter your frist Matrix Data");
        enterData(sc,fristMatrix,Rows,Colls);
        System.out.println("Enter your second Matrix Data");
        enterData(sc,secMatrix,Rows,Colls);
        double[][] sumMatrix = addMatrixes(fristMatrix,secMatrix);
        System.out.println("After add 2 matrix");
        for(int c = 0; c < Rows; c++){
            for(int d = 0;d < Colls;d++){
                System.out.print(sumMatrix[c][d] + "\t");
            }
            System.out.println();
        }
    }
    public static double[][] createNewMatrix(int Rows,int Colls){
        double[][] matrix = new double[Rows][Colls];
        return matrix;
    };
    public static void enterData(Scanner scan,double[][] matrix,int Rows,int Colls){
        for(int i = 0;i < Rows; i++){
            System.out.println("Row " + i);
            for (int j = 0; j < Colls; j++){
                matrix[i][j] = scan.nextDouble();
            }
        }
    };
    public static double[][] addMatrixes(double[][] matrix1, double[][] matrix2){
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[0].length;j++){
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
