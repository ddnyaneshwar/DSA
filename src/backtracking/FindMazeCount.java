package backtracking;

public class FindMazeCount {
    public static void main(String[] args) {
        int[][] matrix=new int[3][3];
        int maxRows=matrix.length;
        int maxColm=matrix[0].length;
        int noOfways=findCountOfPathToReachLastRwCol(matrix,0,0,maxRows,maxColm);
        System.out.println(noOfways);
        print(matrix);

    }

    private static int findCountOfPathToReachLastRwCol(int[][] matrix,int rwStart, int colStart, int maxRows, int maxColm) {
        if(rwStart>=maxRows || colStart >=maxColm) return 0;
        if(rwStart==maxRows-1 && colStart == maxColm-1) return 1;
        if(matrix[rwStart][colStart]>0) return matrix[rwStart][colStart];
        int downWays = findCountOfPathToReachLastRwCol(matrix,rwStart+1,colStart,maxRows,maxColm);
        int rightWays = findCountOfPathToReachLastRwCol(matrix,rwStart,colStart+1,maxRows,maxColm);
        return matrix[rwStart][colStart]=downWays + rightWays;

    }

    public static void print(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
