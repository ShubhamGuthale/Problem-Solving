//StringBuilder ----> reverse a string

public class dsa14 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);

        for(int i=0;i<sb.length()/2;i++)
        {
        int frant=i;
        int back=sb.length()-1-i;
        
        char fchar=sb.charAt(frant);
        char bchar=sb.charAt(back);
        
        sb.setCharAt(frant, bchar);
        sb.setCharAt(back, fchar);
        }
        System.out.println(sb);
    }
    
}
