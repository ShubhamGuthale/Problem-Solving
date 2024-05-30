//Print all Divisors of a number - Code 360 Coding Ninjas
import java.util.*;
public class Solution {
    public static List<Integer> printDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        List<Integer> divisors = printDivisors(n);
        System.out.println("Divisors of " + n + " are: " + divisors);
    }
}
//Tc O(n).

//problem link - https://www.naukri.com/code360/problems/print-all-divisors-of-a-number_1164188
