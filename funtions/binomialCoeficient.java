import java.util.Scanner;

public class binomialCoeficient {

    public static int factorial(int n){
        int fact=1;
        int count=1;
        while (count<=n) {
            fact=fact*count;
            count++;
        }
        return fact;
    }

    public static int binomialCoeffient(int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr_fact=factorial(n-r);
        int result=n_fact/(r_fact*nmr_fact);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        System.out.println("Enter r");
        int r=sc.nextInt();

        int coeffient= binomialCoeffient(n,r);
        System.out.println("bionomial coeficient is "+coeffient);
    }
}
