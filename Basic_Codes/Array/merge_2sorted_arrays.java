import java.util.*;

// program to merge 2 sorted arrays.

public class main{
    static void merge(int a[], int b[]){
     
        int l = a.length;
        if(a.length<b.length){
            l = b.length;
        }
        for(int i=0; i<l; i++){
            if(b[i]<a[i]){
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    public static void main(String []args){
        int a[] = {2,15,26,8,17};
        int b[] = {11,4,9,22,6};
        merge(a,b);
    }
}
