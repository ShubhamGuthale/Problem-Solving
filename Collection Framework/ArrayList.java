import java.util.*;
public class dsa36 {
    public static void main(String[] args) {
        Arraya1<Integer> a1=new Arraya1<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        System.out.println(a1);

       //get element
       int element=a1.get(0);
       System.out.println(element);

       //add element perticular position
       a1.add(1,1);//index:1,element:1
       System.out.println(a1);
       
       //set element
       a1.set(0,5);//index:0,element:5
       System.out.println(a1);

        //delete elements
       a1.remove(0); // 0 is the index
       System.out.println(a1);

       //size of ArrayList
       int size = a1.size();
       System.out.println(size);

       //Loops on ArrayList
       for(int i=0; i<a1.size(); i++)
           {
           System.out.print(a1.get(i) + " ");
            }
       System.out.println();
        
       //Sorting the ArrayList
       a1.add(0);
       Collections.sort(a1); //import java.util.Collection 
       System.out.println(a1); 
     }
   }

/*Output: [1, 2, 3]
           1
           .
           .
           .
*/
