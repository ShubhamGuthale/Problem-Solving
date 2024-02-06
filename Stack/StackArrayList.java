import java.util.*;
public class dsa38 {
    static class stack
    {
    static ArrayList<Integer> a1=new ArrayList<>();
    public static boolean isEmpty()
    {
        return a1.size() == 0;
    }
    //push
    public static void push(int data)
    {
        a1.add(data);
    }
    //pop
    public static int pop()
    {
        if(isEmpty())
        {
            return -1;
        }
        int top=a1.get(a1.size()-1);
        a1.remove(a1.size()-1);
        return top;
    }
    //peek
    public static int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return a1.get(a1.size()-1);
    }
    }
    public static void main(String args[])
    {
      stack s=new stack();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      while(!s.isEmpty())
      {
        System.out.println(s.peek());
        s.pop();
      }
    }
}

/*Output : 4
           3
           2
           1 */
