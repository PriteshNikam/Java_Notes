import java.util.*;

// program to find duplicate element in array.

public class Main{
    public static void main(String []args){
        int a[] = {1,2,2,3,4,5,1,6,5};
        int l = a.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<l; i++){
            if(arr.contains(a[i])){
                System.out.print(a[i]+" ");
            }
            else{
                arr.add(a[i]);
            }
        }
    }
}
