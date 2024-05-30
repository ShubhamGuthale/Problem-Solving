//Palindrome number - Code 360 Coding Ninjas

import java.util.*;
public class Solution 
{
	public static void palindrome(int n)
	{
		int orignal = n;
		int revn=0;
		while(n>0)
		{
		revn=revn*10+n%10;
		n=n/10;
		}
		if(orignal==revn)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
	}

	
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		palindrome(n);	
	}
}

//Problem Link - https://www.naukri.com/code360/problems/palindrome-number_624662
