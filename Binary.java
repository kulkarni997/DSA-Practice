public class Binary {
    public static int BinSearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;

            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void Reserve(int arr[]){
        int first=0; int last=arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }        
    }

    
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18};
        int key = 14;
        int result = BinSearch(arr, key);

        if(result == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index: " + result);
    }
}
