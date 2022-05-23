import java.util.Scanner;

// program to find factorial of number

public class Factorial {

    // by using Recursion
    
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

    // by using while loop
    
    static void factorial1(int i){
        int f=1;
        while(i!=1){
            f*=i;
            i--;
        }
        System.out.println(f);
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(factorial(n));
        factorial1(n);
    }
}
