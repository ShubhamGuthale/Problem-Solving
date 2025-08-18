public class dsa88 {
    public static void main(String args[]) {
        int arr[] = {10, 20, 50, 15, 20, 25};
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max
            }
        }

        System.out.println("Maximum value is " + max);
    }
}
