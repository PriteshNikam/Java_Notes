import java.util.Scanner;

// program to find GCD.

public class GCD {
    static int gcd(int x, int y){
        if(x==0){
            return y;
        }
        if(y==0){
            return x;
        }
        if(x==y){
            return x;
        }
        if(x>y){
            return gcd(x-y,y);
        }
        else{
            return gcd(x,y-x);
        }
    }

    // more efficient way
    // Euclid algorithm
    static int gcd2(int a, int b){
        if(b==0) {
            return a;
        }
        return gcd(b,a%b);
    }


    public static void main(String []args){
        int i =98;
        int j =56;
        System.out.println("normal method: "+gcd(i,j));
        System.out.println("efficient method: "+gcd2(i,j));
    }
}
