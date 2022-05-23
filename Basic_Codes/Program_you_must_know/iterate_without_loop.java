
//program to print 1 to 50 without loop,using recursion.

public class Main{
    static void pri(int i,int j){
        
        //using if.
        if(i!=j+1){
            System.out.println(i);
            i++;
            pri(i,j);
        }
    }
    public static void main(String[] args){
        int i=1;
        int j=50;
        pri(i,j);
    }
}
