import java.util.*;

// program to move all -ve ele one side.

public class Main{
    public static void main(String[] args) {
        int a[] = {1, 2, -1, -5, 18, -3};
        int l = a.length - 1;
        int low = 0;
        for (int i = 0; i <=l; i++) {
            if (a[i] < 0) {
                int temp = a[low];
                a[low] = a[i];
                a[i] = temp;
                low++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
