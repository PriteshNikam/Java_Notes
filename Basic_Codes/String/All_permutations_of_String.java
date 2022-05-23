import java.util.*;   //  this means that you import all the classes of the utility package in the program.

// Program to find all possible permutaions of String.

public class Main {
    static void permu(String s, int i, String ch){
        if(i == s.length()){
            System.out.println(ch);
            return;
        }
        permu(s,i+1,ch+s.charAt(i));   // consider current char as part of string
        permu(s,i+1,ch);               // do not consider current char as part of string
    }
    public static void main(String[] args) {
        String s = "abc";
        int i = 0;
        permu(s,i,"");
    }
}



/* Output - 
    abc
    ab
    ac
    a
    bc
    b
    c
 */   
