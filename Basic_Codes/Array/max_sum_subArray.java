import java.util.*;

// kadane's algorithm
// print sub array with max sum

public class Main{
    static int[] subarray(int[] a){
        int l = a.length;
        int max=0;
        int maxsub=0;
        int start=0;
        int end = 0;
        int beg = 0;
        for(int i=0; i<l; i++){
            maxsub += a[i];
            if(maxsub<a[i]){
                maxsub = a[i];
                beg = i;
            }
            if(max<maxsub){
                max = maxsub;
                start = beg;
                end = i;
            }
        }
        return Arrays.copyOfRange(a,start,end+1);
    }
    public static void main(String []args){
        int a[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int r[] = subarray(a);
        System.out.println(Arrays.toString(r));
    }
}
