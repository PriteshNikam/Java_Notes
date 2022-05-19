import java.util.*;  // this means that you import all the classes of the utility package in the program.

// program to count repeated char in String.
// this program also count space in String.

public class Duplicate_char_in_string {

    // this method make array of size 256 , so you may also use HaspMap which will be size of string length.
    static int char_count = 256;
    static int[] fill(String s,int count[]){
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)]++;
        }
        return count;
    }
    static void printdup(String s){
        int count[] = new int[char_count];
        fill(s,count);

        for(int i=0; i<count.length-1; i++){
            if(count[i]>=1){
                System.out.println((char)i+", count is - "+count[i]);
            }
        }
    }
    public static void main(String args[]){
        String s = "geeks for geeks";
        printdup(s);
    }
}


/* Output - 
    , count is - 2 // this also count space in string
   e, count is - 4
   f, count is - 1
   g, count is - 2
   k, count is - 2
   o, count is - 1
   r, count is - 1
   s, count is - 2
*/
