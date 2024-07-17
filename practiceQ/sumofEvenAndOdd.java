import java.util.*;
public class sumofEvenAndOdd {
    public static void main(String[] args) {
        //Write a program that reads a set of integers and and then print the sum of even and odd integers

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int evenSum=0;
        int oddSum=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                evenSum=evenSum+i;
            }

            if(n%i!=0){
                oddSum=oddSum+i;
            }
        }
        System.out.println("sum of even numbers is : "+evenSum);
        System.out.println("Sum of odd numbers is : "+oddSum);
    }
}
