import java.util.*;  
import java.util.regex.Pattern;

// program to reverse String by word.
// I/P - "My live in Satara" 
// O/P - "Satara in live My"
// here we have used 3 diff. method to do this.

public class Main {

    // 1. using split method
    
    static void reverse1(String s){
        System.out.print("simply using split() -- ");
        String ch[] = s.split(" ");
        for(int i= ch.length-1; i>=0; i--){
            System.out.print(ch[i]+" ");
        }
    }

    // 2. using StringBuilder
    
    static void reverse2(String s){
        System.out.println();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        sb.append(' ');
        StringBuilder result = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=' '){
                sb2.append(sb.charAt(i));
            }
            else{
                sb2.reverse();
                sb2.append(' ');
                result.append(sb2);
                sb2.delete(0,sb2.length());
            }
        }
        System.out.println("*StringBuilder* -- "+result);
    }

    // 3. using Pattern class
    
    static void reverse3(String s){
        Pattern p = Pattern.compile("\\s");
        String a[] = p.split(s);
        System.out.print("Pattern class -- ");
        for(int i=a.length-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String []args){
        String s = "words by reverse to String";
        reverse1(s);
        reverse2(s);
        reverse3(s);
    }
}
