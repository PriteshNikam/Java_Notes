import java.util.Scanner;

// program to find fibonacci series.
//fibonacci number means --> 0 1 1 2 3 5 8 13 21 34 55.

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number for Fibonacci series: ");
        int n=s.nextInt();
        int n1=0,n2=1,n3=0;
        System.out.print(n1+" "+n2);
        int i=2;
        while(i<=n){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            i++;
    }
}
