import java.util.*;

// program to check entered number is even or odd.

public class Main
{
    static void checkNumber(int n){
        if(n%2==0){
            System.out.printf("%d is even",n);
        }
        else{
            System.out.printf("%d is odd",n);
        }
        
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		checkNumber(n);
	}
}
 
