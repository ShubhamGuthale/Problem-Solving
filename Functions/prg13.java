import java.util.Scanner;

class prg13
{
    public static void main(String[] args) {
        int ans= sum();
        System.out.println("Your sum or addition is : " + ans);
        //int ans=sum(20,30) .....fun call
    }
   //static int sum(int a,int b)
   //int sum=a+b;
   //return sum;

   static int sum()
    { Scanner in = new Scanner(System.in);
      System.out.println("enter first number : ");
        int a = in.nextInt();
    
      System.out.println("enter Second number : ");
        int b = in.nextInt();
       int sum = a+b;
      return sum;
    }
}
