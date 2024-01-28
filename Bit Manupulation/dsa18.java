/*
 // bit manupulation 
 // clear bit - given position bit change by 0.

  bitmap = 1<<position
  operand = and with not
n = 5 = 0101
 1 = 0100 ----> 1<<position(2) 
 ~(0100) | 0101 = 1011 | 0101 ==0001 -----> position 2 clear binary bit 0 i.e 0101 to 0001 clear bit 0 index 2
 */
public class dsa18 {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmap=1<<2;
        int clear=~(bitmap)& n;
        System.out.println(clear);
        
    }
}
