package backtracking;

public class FindPathToReach {
    public static void main(String[] args) {
        int rows= 2 ;
        int col= 2;

        findPath(0,0,rows,col,"");


    }

    private static void findPath(int startRow, int startCol, int maxRpws, int maxCol, String currentString) {
        if(startRow>=maxRpws || startCol >= maxCol){
            return;
        }
        if(startRow==maxRpws-1 && startCol == maxCol-1){
            System.out.println(currentString);
            return;
        }

        findPath(startRow+1,startCol,maxRpws,maxCol,currentString+"D");
        findPath(startRow,startCol+1,maxRpws,maxCol,currentString+"R");

    }
}
