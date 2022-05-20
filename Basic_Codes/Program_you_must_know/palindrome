import java.util.*;

public class Main{
    // Method to check string palindrome
    static void checkPalindrome(String str){
        String p = "";
        for(int i=str.length()-1;i>=0;i--){
            p+=str.charAt(i);
        }
        //System.out.println(p);
        if(p.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
    // method to check integer palindrome
    static void checkPalindrome2(int x){
        StringBuilder s = new StringBuilder(String.valueOf(x));
        s.reverse();
        int n = Integer.parseInt(String.valueOf(s));
        if(n==x){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        String str = s.next(); 
        checkPalindrome(str);  // check string is palidrome or not.
        int N = s.nextInt();
        checkPalindrome2(N);   // check integer is palidrome or not.
    }
}
