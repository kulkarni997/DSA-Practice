public class Assignement1 {

    //O(n^2)
    public static boolean Repeat(int numbers[]){
        boolean repeat = false;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i+1; j<numbers.length; j++){
                int end = j;
                if(numbers[start] == numbers[end]){
                    repeat = true;
                    break;
                }
            }
        }
        if(repeat){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3};
        System.out.println(Repeat(numbers));
    }
}
