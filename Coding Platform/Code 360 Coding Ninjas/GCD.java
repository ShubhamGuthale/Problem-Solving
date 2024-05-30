// GCD - Code 360 Coding Ninjas
import java.util.*;
public class Solution {
	
	public static int gcd(int a, int b) {
		// Euclidean algorithm to find GCD
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println( gcd(a, b));
	}
}
//problem link -  https://www.naukri.com/code360/problems/gcd_6557
