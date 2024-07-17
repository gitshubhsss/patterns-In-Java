import java.util.Scanner;

public class factorial {
    // write a funion to find the factorial of a programm

    public static int findFacto(int n) {
        int fact = 1;
        int count = 1;
        do {
            fact = fact * count;
            count++;
        } while (count <= n);
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int fact = findFacto(n);
        System.out.println("factorial : " + fact);
    }
}
