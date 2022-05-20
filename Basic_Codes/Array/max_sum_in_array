import java.util.*;

//  Kadane's Algorithm
// program to find max sum possible in array.

class Main{
    public static void main(String []args){
        int a[] = {1,2,3,-2,5};
        //int a[] = {-1,-2,-3,-4};
        int max=a[0];
        int tillMax = 0;
        for(int i=0; i<a.length; i++){
            tillMax += a[i];
            if(max<tillMax){
                max = tillMax;
            }
            if(tillMax<0){
                tillMax = 0;
            }
        }
        System.out.println(max);
    }
}
