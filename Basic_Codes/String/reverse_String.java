import java.util.*;    // this means that you import all the classes of the utility package in the program.

 // Program to reverse string. 

public class Main
{
	public static void main(String[] args) {
		String str  = "Maharashtra";
		
		// 1. by using for loop.
		for(int i=str.length()-1; i>=0;i--){
		    System.out.print(str.charAt(i));
		}
		System.out.println();
		
		// 2. By using StringBuilder.
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		
	}
}
