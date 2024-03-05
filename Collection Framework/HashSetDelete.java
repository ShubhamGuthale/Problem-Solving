//Hashing - HashSet
import java.util.HashSet;
class dsa60
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
        if(set.contains(1))
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

    }
}

//Output :
//[1, 2, 3, 4]
//set contain 1
//we deleted 1
//[2, 3, 4]
