import java.util.Scanner;

public class TwoDArrays {

    public static boolean Search(int matrix[][], int key, int n, int m) {
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at :" +"(" +i+ "," +j+ ")");
                    return true;
                }
            }
        }
        System.out.println("Oops! Key not found in the matrix");
        return false;
        
    }

    public static int Largest(int matrix[][], int n, int m){
        int largest = Integer.MIN_VALUE;
        int element;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                element = matrix[i][j];
                if(element>largest){
                    largest = element;
                }
            }
        }
        return largest;
    }

    public static int Smallest(int matrix[][], int n , int m){
        int smallest = Integer.MAX_VALUE;
        int element;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                element = matrix[i][j];
                if(element<smallest){
                    smallest = element;
                }
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][4];
        int n = matrix.length;
        int m = matrix[0].length;
        int key = 11;

       //input
       System.out.println("Enter the input array : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Smallest(matrix, n, m));
    }
}
