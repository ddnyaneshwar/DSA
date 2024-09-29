package backtracking;

public class FindMazeCount {
    public static void main(String[] args) {
        int[][] matrix=new int[3][3];
        int maxRows=matrix.length;
        int maxColm=matrix[0].length;
        int noOfways=findCountOfPathToReachLastRwCol(0,0,maxRows,maxColm);
        System.out.println(noOfways);
    }

    private static int findCountOfPathToReachLastRwCol(int rwStart, int colStart, int maxRows, int maxColm) {
        if(rwStart>=maxRows || colStart >=maxColm) return 0;
        if(rwStart==maxRows-1 && colStart == maxColm-1) return 1;

        int downWays = findCountOfPathToReachLastRwCol(rwStart+1,colStart,maxRows,maxColm);
        int rightWays = findCountOfPathToReachLastRwCol(rwStart,colStart+1,maxRows,maxColm);
        int totalNoOfWays=downWays + rightWays;
        return totalNoOfWays;
    }
}
