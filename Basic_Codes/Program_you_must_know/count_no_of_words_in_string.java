//program to print number of words in string.
//their is fault in program ,even if program has empty string it returns 1.
//use ' ' instead of " " this. because " " represent string and ' ' represent characters.


public class Main{
    public static void main(String[] args) {
        String s = "my name is pritesh and Iam a Computer Engineer";
        int count=1;
        for (int i = 0; i < s.length() - 1; i++) {
            if((s.charAt(i)==' ') && s.charAt(i+1)!=' '){//** use this ' '
                count++;
            }
        }
        System.out.println(count);
    }
}
