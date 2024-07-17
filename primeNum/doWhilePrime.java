import java.util.Scanner;

public class doWhilePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean isPrime = true;
        int count = 2;

        do {
            if (n == 2) {
                continue;//just skip the 2 okay 
            }
            if (n % count == 0) {
                isPrime = false;
            }
            count++;
        } while (count <=Math.sqrt(n));


        if (isPrime == false) {
            System.out.println("it is not a prime number");
        } else {
            System.out.println("it is a prime number");
        }
    }
}
