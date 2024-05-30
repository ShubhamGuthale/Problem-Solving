// Reverse of a number - code 360 coding ninjas
import java.util.*;
public class Main
 {
	static int revers(int n) 
    { 
        int revn = 0; 
        while(n > 0) 
        { 
            revn = revn * 10 + n% 10; 
            n = n/ 10; 
        } 
        return revn; 
	}
	
	public static void main(String[] args) 
	{
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(revers(n)); 
    } 
}

//Problem Link - https://www.naukri.com/code360/problems/reverse-of-a-number_624652
