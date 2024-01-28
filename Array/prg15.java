import java.util.Scanner;

class prg15
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter values");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();

        }
        System.out.println("Element are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
