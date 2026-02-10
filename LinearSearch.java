import java.util.Scanner;

public class LinearSearch{
    
    
    public static void Linear(int key, int arr[]){
        boolean isfound = false;
        int n = arr.length;
        for(int i=0; i<n;i++){
            if(arr[i] == key){
                System.out.println("The key is found at : "+n);
                isfound = true;
                break;
            }
        }
        if(!isfound){
            System.out.println("The key is not found");
        }
    }

    public static void main(String[] args) {
        int key = 17;
        int arr[] = {2,4,6,8,10,16,18};
        Linear(key, arr);
    }
}