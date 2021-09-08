import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    final static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double principal = principal();
        float interestRate = interestRate();
        int years = years();
        System.out.println(mortgaeAmount(principal, interestRate, years));
        
    }

    public static double principal() {
        System.out.print("Principle: ");
        Double principal = scan.nextDouble();
        return principal;
    }

    public static float interestRate() {
        System.out.print("Annual Interest Rate(Percent): ");
        float interestRate = scan.nextFloat();
        return interestRate/12;
    }
    public static int years() {
        System.out.print("Period (Years): ");
        int years = scan.nextInt();
        scan.close();
        return years;
    }

    public static String mortgaeAmount(double principal,float interestRate, int years) {
        // Formula  M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1]
    //    System.out.println(principal + " " + interestRate + " " + years);
       float monthlyInterest = interestRate/100 ;
       int  months = years * 12 ;
       double expression = Math.pow( (1 + monthlyInterest) , months);
    //    System.out.println(expression);

        double result = principal * ( (monthlyInterest * expression) / (expression - 1) ) ;
       
        return NumberFormat.getCurrencyInstance().format(result);
    }
}
