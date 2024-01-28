//Tower Of Honoi
//Time Complexicity : O(2^n)

import java.util.Scanner;

public class dsa24 {
    public static void towerOfHanoi(int n,String src,String helper,String dest)
    {
        if (n==1) {
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
      towerOfHanoi(n-1, src, dest, helper); //change position of helper to dest
      System.out.println("transfer disk "+n+" from "+src+" to "+dest);  
      towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n=sc.nextInt();
        towerOfHanoi(n, "S", "H", "D");
    }
    
}
