//Hashing - HashSet
import java.util.HashSet;
import java.util.Iterator;
class dsa62
{
    public static void main(String args[])
    {//Insertion
        HashSet <Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        System.out.println(set);
        
        //search - contains or not.
       /*  if(set.contains(1))
        {
            System.out.println("set contain 1");
        }
        
        //Delete
        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println("we deleted 1");
        }
        System.out.println(set);
        
        //Size
        System.out.println("size of set is :"+set.size());*/

        //Iterator
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}

/*
Output Of Iterator : //No sure for assending order about iterator.
1
2
3
4
*/
