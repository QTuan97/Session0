package src.Practice;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem Toan");
        double Toan = sc.nextDouble();
        System.out.println("Nhap diem Vat Ly");
        double VatLy = sc.nextDouble();
        System.out.println("Nhap diem Hoa");
        double Hoa = sc.nextDouble();
        double Total = (Toan + VatLy + Hoa)/3;
        System.out.println("Diem trung binh: " + Total);

    }

}
