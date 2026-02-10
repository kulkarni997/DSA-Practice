public class FindLargest {
    public static int Largest(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 30, 12, 14, 16, 18, 20};

          int ans = Largest(arr);   // call + store result
          System.out.println("Largest element is: " + ans);
    }
}
