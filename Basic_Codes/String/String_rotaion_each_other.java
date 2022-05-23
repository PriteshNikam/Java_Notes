import java.util.*;

// A Program to check if strings are rotations of each other or not.

public class String_rotation_each_other {
    static boolean check(String s1, String s2){
        String s = s1.concat(s1);   // AACD+AACD = AACDAACD
        boolean b = false;
        if(s1.length()==s2.length() && s.contains(s2)) {
            b = true;
        }
        return b;
    }
    public static void main(String[] args) {
        String s1 = "AACD";
        String s2 = "ACDA";
        if(check(s1,s2)){
            System.out.println("String are rotation of each other");
        }
        else{
            System.out.println("Not rotation");
        }
    }
}
