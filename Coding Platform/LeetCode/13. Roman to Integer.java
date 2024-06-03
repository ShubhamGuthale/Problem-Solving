import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        int sum = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = m.get(s.charAt(i));
            
        
            if (value < prevValue) {
                sum -= value;
            } else {
                sum += value;
            }
            
            prevValue = value;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));   
        System.out.println(solution.romanToInt("IV"));    
        System.out.println(solution.romanToInt("IX"));     
        System.out.println(solution.romanToInt("LVIII"));  
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
