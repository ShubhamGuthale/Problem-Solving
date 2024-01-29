//Q.Number is Palindrome or not

import java.util.*;
public class Palindrome {
        public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number : " );
          int num = sc.nextInt();
          int revNum = 0;
          int originalNum = num;
          
          //reverse 
          while (num > 0) 
          {
            int rem = num % 10;
            num /= 10;
            revNum = revNum * 10 + rem;
          }
          
          // check if revNum and originalNum are equal or not
          if (originalNum == revNum)
           {
            System.out.println(originalNum + " is Palindrome.");
          }
          else 
          {
            System.out.println(originalNum + " is not Palindrome.");
          }
      }
}
