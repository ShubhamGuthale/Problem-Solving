//Time Complexity ----> nlogn

public class MergeSort {
   public static void conquer(int arr[],int Sindx,int mid,int Eindx)
   {
    int merged[]=new int[Eindx - Sindx +1];
    int idx=Sindx;
    int idx2=mid+1;
    int x=0;

    while(idx<=mid && idx2<= Eindx)
    {
        if(arr[idx]<=arr[idx2])
        {
            merged[x++]=arr[idx++];
        }
        else
        {
            merged[x++]=arr[idx2++];
        }
    }
    while(idx <= mid)
    {
        merged[x++]=arr[idx++];
    }
    while(idx2 <= Eindx)
    {
        merged[x++]=arr[idx2++];
    }
    for(int i=0,j=Sindx;i<merged.length;i++,j++)
    {
        arr[j]=merged[i];
    }
   }
   public static void divide(int arr[],int Sindx,int Eindx)
   {
    if(Sindx>=Eindx)
    {
        return;
    }
    int mid=Sindx+(Eindx-Sindx)/2;
    divide(arr,Sindx,mid);
    divide(arr,mid+1,Eindx);
    conquer(arr,Sindx,mid,Eindx);
   } 

public static void main(String args[])
{
    int arr[]={121,21,51,111,11};
    int n=arr.length;
    divide(arr, 0, n-1);
    System.out.println("Sorted Array is : ");
    for(int i=0;i<n;i++)
    {
        System.out.println(arr[i]+"");
    }
    System.out.println();
}
}
