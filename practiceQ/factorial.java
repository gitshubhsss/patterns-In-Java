import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //program to print the factorial of number

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int factorial=1;
        int count=1;
        while (count<=n) {
            factorial=factorial*count;
            count++;
        }

        System.out.println("Factorial is "+ factorial);
    }
}
