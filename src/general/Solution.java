package general;


// Main class should be named 'SolutionCustomer' and should not be public.

/*

**
Given a 2-dimensional grid of characters, and a dictionary, find all words in the grid that also appear in the dictionary. A word can be formed by traversing the grid by going either left, right, top, or down, but NOT diagonal. Also, a single grid position can not be used more than once in a word.
For instance, in the following 3x3 grid, with a dictionary of [ CAT, COPY, ASK, SOS ]


C A T
O S K
P Y U


The first 3 words can be found in the grid, but not SOS, since one cannot use S twice.


*/
class Solution {
    public static void main(String[] args) {
        
        String[][] dict = {
            {"C","A","T"},
            {"O","S","K"},
            {"P","Y","U"}
        };
        
       String[] words = { "CAT", "COPY", "ASK", "SOS" };

        // Iterate through each word and check if it is in the grid
        for (String word : words) {
            System.out.println("Word " + word + " is in the grid: " + findWordInDict(dict, word));
        }
        
        
        
    }
    
    public static boolean findWordInDict(String[][] dict, String word){
        int maxRows=dict.length;
        int maxCols=dict[0].length;
        boolean ans=false;
        for(int i=0;i< maxRows;i++){
            for(int j=0;j<maxCols;j++){
                
                if (dict[i][j].equals(String.valueOf(word.charAt(0)))) {
                    
                    if (visitAround(dict, i, j, maxRows, maxCols, word, 0, new boolean[maxRows][maxCols])) {
                        return true;
                    }
                }
            }
        } 
        return ans;  
    }
    
    public static boolean visitAround(String[][] dict, int i, int j, int maxRows, int maxCols, String word, int index, boolean[][] visited) {
    
        if (i < 0 || i >= maxRows || j < 0 || j >= maxCols || visited[i][j] || !dict[i][j].equals(String.valueOf(word.charAt(index)))) {
            return false;
        }

        
        if (index == word.length() - 1) {
            return true;
        }

       
        visited[i][j] = true;

        // Check all four possible directions (up, down, left, right)
        boolean found = visitAround(dict, i + 1, j, maxRows, maxCols, word, index + 1, visited) || // Down
                        visitAround(dict, i - 1, j, maxRows, maxCols, word, index + 1, visited) || // Up
                        visitAround(dict, i, j + 1, maxRows, maxCols, word, index + 1, visited) || // Right
                        visitAround(dict, i, j - 1, maxRows, maxCols, word, index + 1, visited);   // Left

     
        visited[i][j] = false;

        return found;
    }
    
    
}
