public class prg {
  public static void main(String[] args) {
      int rows = 6; 
      int start = 1;

      for (int i = 1; i <= rows; i++) {
          int num = start;
          int diff = 5;

          // Print row
          for (int j = 1; j <= i; j++) {
              System.out.print(num + "\t");
              num = num - diff;
              diff--;
          }
          System.out.println();

          // Update start
          start = start + (6 - i);
      }
  }
}


//1
//6       1
//10      5       1
//13      8       4       1
//15      10      6       3       1
//16      11      7       4       2       1
