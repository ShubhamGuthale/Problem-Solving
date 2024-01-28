import java.util.*;
class prgswitch
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruit name: ");
        String fruit = in.next();
        
       /*  switch (fruit) {
            case "mango":
            System.out.println("king of fruit");
                break;
            case "orange":
            System.out.println("Round fruit");
                break;
            case "apple":
            System.out.println("A Sweet Red fruit");
                break;
            case "grape":
            System.out.println("Smallest fruit");
            break;
            
            default:
            System.out.println("Enter valid fruit Name");
        
            break;*/
        //another method for switch case   
        switch (fruit) {
            case "mango"  -> System.out.println("king of fruit");
            case "orange" -> System.out.println("Round fruit");
            case "apple"  -> System.out.println("A Sweet Red fruit");
            case "grape"  -> System.out.println("Smallest fruit");
            default       -> System.out.println("Enter valid fruit Name");
        }
        /*anothet way case declare in 1line
        switch(day){
        case 1,2,3,4,5 -> System.out.println();
        case 6,7 -> System.out.println();
        } */
        System.out.println();
    }
}
