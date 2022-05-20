import java.util.*;

// this is not the optimized solution
// O(n*k)

public class Main{
    public void rotateR(int[] ar, int k){
        for(int i=0; i<k; i++){
            rightRotate(ar);
        }
    }
    public void rotateL(int[] ar,int k){
        for(int i=0;i<k;i++){
            leftRotate(ar);
        }
    }
    public void rightRotate(int ar[]){
            int t = ar[ar.length-1];
            for (int i=ar.length-1;i>0; i--) {
                ar[i] = ar[i - 1];
            }
            ar[0] = t;
        }
    public void leftRotate(int ar[]){
        int t = ar[0];
        for(int i=0;i<ar.length-1;i++){
            ar[i] = ar[i+1];
        }
        ar[ar.length-1] = t;
    }
    public static void main(String []args) {
        // time complexity is O(n^2)
        Rotate_array r = new Rotate_array();
        int ar[] = {1,2,3,4,5,6,7};    // this array to rotate right side.
        int ar2[] = {1,2,3,4,5,6,7};   // this array to rotate left side.
        System.out.println("Array before rotaion"+Arrays.toString(ar));
        r.rotateR(ar,2);
        r.rotateL(ar2,2);
        System.out.println("Arrays rotates to right side: "+Arrays.toString(ar));
        System.out.println("Arrays rotates to left side: "+Arrays.toString(ar2));
    }
}
