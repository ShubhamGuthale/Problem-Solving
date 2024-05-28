//Check Armstrong - Code 360 Coding Ninjas
import java.util.*;
public class Main {
	public static void Armstrong(int n)
	{
		int orignal=n;
		int sum=0;
		int lastdigit=0;
		while(n>0)
		{
			lastdigit=n%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
			n=n/10;
		}
		if (sum==orignal)
		{
		System.out.println("true");	
		} 
		else 
		{	
		System.out.println("false");	
		}

	}
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Armstrong(n);

	}
}

//problem link -   https://www.naukri.com/code360/problems/check-armstrong_589
