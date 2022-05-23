import java.util.*;

// program to check wether number is armstrong or not.
// Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
// example  - 

   //   153 = 1*1*1 + 5*5*5 + 3*3*3 = 153  so it is armstrong number.

   //   571 = 5*5*5 + 7*7*7 + 1*1*1 = 469  so it is not armstrong number.

// code ->

public class Main {
     
     static int order(int o){
        int i=0;
        while(o!=0){
            i+=1;
            o/=10;
        }
        return i;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt(); // 371 is an Armstrong number.
        
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            int o = order(number);
            result += Math.pow(remainder, o);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
