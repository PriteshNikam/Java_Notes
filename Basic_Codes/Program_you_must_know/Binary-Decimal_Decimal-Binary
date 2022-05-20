import java.util.Collections;

// program to convert binary to decimal & decimal to binary.

public class Main{
    // method to convert binary to decimal
    
    static int btd(int b){
        int dec = 0;
        int temp = b;
        int base = 1;
        while(temp>0){
            int rem = temp%10;
            dec += rem*base;
            temp = temp/10;
            base = base*2;
        }
        return dec;
    }
    
    // method to convert decimal to binary
    
    static StringBuilder dtb(int d){
        //return Integer.toBinaryString(d);  // direct way to convert
        int temp = d;
        String s = "";
        while(temp>0){
            s = s+temp%2;
            temp=temp/2;
        }
        StringBuilder bol = new StringBuilder(s);
        bol.reverse();
        return bol;
    }
    public static void main(String[] args){
        int binary = 10101001;
        System.out.println(btd(binary));
        System.out.println(dtb(169));

    }
}
