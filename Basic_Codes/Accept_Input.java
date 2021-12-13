//WHAT YOU CAN UNDERSTAND FROM THIS CODE?? 
//--> Here you can understand how to accept different types of input from user.

import java.util.Scanner;  // package for Scanner class.


public class Accept_Input {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in); // By using Scanner you can accept input from user. (System.in - to accept input from keyboard).
        
        int a = s.nextInt();
        float b = s.nextFloat();
        s.next();                // after accpeting integer,float,double, cursor remains next to the input so just create new line to accept String other wise it will skip it.
        String c = s.nextLine(); // take whole line.
        String g = s.next();     // takes only single word.
        boolean d = s.nextBoolean(); // True or False only
        char e = s.next().charAt(0); 
        double f = s.nextDouble();
		 
        System.out.println(a +" "+ b +" "+c+" "+d+" "+e+" "+f);
    }
}
