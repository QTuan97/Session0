package src;
import java.util.Scanner;
public class ptbac2 {
    public static void main(String[] args) {
        System.out.println("Linear Quadratic Equation");
        System.out.println("Given a quadratic equation as 'a * x ^ 2 + b * x + c = 0 ', please enter constants:");
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b,2) - (4*a*c);
        if(a == 0){
            if(b!= 0){
                double ans = -c/b;
                System.out.println("The answer is " + ans);
            }else{
                System.out.println("Invaild input");
            }
        }else{
            if(delta == 0){
                double ans = -b/a*2;
                System.out.println("The answer is " + ans);
            }else if(delta > 0){
                double ans1 = (-b + Math.sqrt(delta))/(a*2);
                double ans2 = (-b - Math.sqrt(delta))/(a*2);
                System.out.println("The answer is " + ans1 + " and " + ans2);
            }else{
                System.out.println("There's no answer!");
            }
        }
    }
}
