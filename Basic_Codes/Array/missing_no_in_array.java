import java.util.*;

// program to find missing number in array.

public class Main{
    public static void main(String []args){
        int a[] = {1,2,5,9,3,8,4,7,6};
        int n = a.length+1;
        int sum = (n*(n+1))/2;
        for(int i=0; i<n-1; i++){
            sum=sum-a[i];
        }
        System.out.println(Math.abs(sum));
    }
}
