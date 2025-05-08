//Reverse arr
public class prg1 {
  public static void main(String args[])
  {
    int arr[]={2,6,3,1,6,9};
    int n=arr.length;
    int temp[]=new int[n];
    for(int i=0;i<n;i++)
    {
      temp[i]=arr[n-i-1];
    }
    for(int i=0;i<n;i++)
    {
      arr[i]=temp[i];
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+"\t");
    }

  }
}
