import java.util.*;
public class dsa63 {
    public static void main(String args[])
    {
        //country(key), population(value)
        HashMap<String,Integer> map=new HashMap<>();
        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
        
        //Update
        map.put("China",20);

        //search
        if(map.containsKey("China"))
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
 

    }
}
