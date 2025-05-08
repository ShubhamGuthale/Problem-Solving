//find max and min element
public class prg2 {
  public static void main(String args[])
  {
    int arr[]={3,5,4,1,9};
    int n=arr.length;
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
      if(arr[i]<min)
      {
        min=arr[i];
      }
    }
    for(int i=0;i<n;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }
    System.out.println("maximum is :"+max);
    System.out.println("minimum is:"+min);
  }
}
