import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        //write a program to print the multiplication table using do while loop

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int count=1;
        do{
            System.out.println(n+"*"+count+" = "+n*count);
            count++;
            
        }while(count<=10);


    }
}
