/*
 // bit manupulation 
// set bit

  bitmap = 1<<positin
  operand = or
n = 5 = 0101
 1 = 0010 ----> 1<<position(1) 
 0010 | 0101 = 0111 -----> position 1 set binary bit 1 i.e.7 in decimal
 
 */
public class dsa17 {
    public static void main(String[] args) {
     
    int n=5;
    int pos=1;
    //bit mask 1<<pos
    int newnumber= 1<<pos | n;
    System.out.println(newnumber);
    }
}
