import java.util.*;

// program to find whether entered year is leap year or not.

public class Main
{
    static void checkLeapYear(int year){
        boolean isleap = false;
        if(year%4==0){
               if(year%100==0){
                   if(year%400==0){
                       isleap=true;
                   }
                   else{
                       isleap=false;
                   }
               }
               else{
                   isleap=true;
               }
           }
           else{
               isleap=false;
           }
            if(isleap){
                System.out.println(year+" is a leap year");
            }
            else{
                System.out.println(year+" is not a leap year");
            }
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		checkLeapYear(n);
	}
}
