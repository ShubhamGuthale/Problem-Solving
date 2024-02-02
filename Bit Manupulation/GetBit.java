//bit manupulation (get bit)
/*
 n = 5 = 0101
 1 = 0001 ----> 1<<position(3) 
 1000 & 0101 ----->0000 all zero means bit zero.othewise bit 1 at perticular position
 */

public class dsa16 {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        if ((bitmask&n) == 0)
         {
            System.out.println("bit was zero");
            
        } else {
            System.out.println("bit was non - zero");
        }
    }
}
