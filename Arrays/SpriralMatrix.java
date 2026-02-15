public class SpriralMatrix {

    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            for(int j =startCol; j<=endCol;j++){
                System.out.println(matrix[startRow][j]+" ");
            }
            for(int i=startRow; i<=endRow; i++){
                System.out.println(matrix[i][endCol]+" ");
            }
            for(int j=endCol-1;j<=startRow;j++){
                if(startRow==endRow){
                    break;
                }
                System.out.println(matrix[endRow][j]+" ");
            }
            for(int i=endRow-1; i>=startRow+1;i++){
                if(startCol==endCol){
                    break;
                }
                System.out.println(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 5, 9, 3},
            {4, 9, 12, 6},
            {13, 7, 5, 2},
            {10, 17, 9, 15}
        };
        printSpiral(matrix);
    }
}
