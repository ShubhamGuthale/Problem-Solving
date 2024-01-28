//Bit Manupulation ----> Get Bit

import java.util.Scanner;
public class dsa19 {
    public static void main(String[] args) {
       int n=5;
       int pos=1;
       int bitmap=1<<pos;
       Scanner sc=new Scanner(System.in);
       int oper=sc.nextInt();

       if (oper==1) {
       int op= bitmap | n;
       System.out.println(op);
        
       } else {
        int nop=~(bitmap) & n;
        System.out.println(nop);
       }
    }
    
}
