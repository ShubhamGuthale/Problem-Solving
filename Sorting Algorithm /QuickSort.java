//Time Complexity ----> Worst : O(n^2)  , Average : O(nlogn).

public class QuickSort {
 public static int partition(int[] arr,int low,int high)
 {
    int pivot=arr[high];
    int i=low-1;

    for(int j=low; j<high; j++)
    {
        if(arr[j]<pivot)
        {
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    i++;
    int temp=arr[i];
    arr[i]=arr[high];
    arr[high]=temp;
    return i;
 }

 public static void quickSort(int arr[],int low,int high)
 {
    if(low<high)
    {
        int pi=partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }

 }

 public static void main(String[] args) 
 {
 int arr[]={11,121,21,151,51};
 int n=arr.length;
 quickSort(arr,0,n-1);
 System.out.println("Sorted Element is : ");
 for(int i=0;i<n;i++)
 {
    System.out.println(arr[i]+" ");
 } 
    System.out.println();
 }   
}
