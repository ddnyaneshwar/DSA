package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

       printSpiralMatrix(matrix);
    }

    private static List<Integer> printSpiralMatrix(int[][] matrix) {
        List<Integer> list=new ArrayList<>();

        int rowStart = 0;
        int rowEnd = matrix.length-1;
        int colStart = 0;
        int colEnd = matrix[0].length-1;


        while (rowStart<=rowEnd && colStart<=colEnd){

            for (int i = colStart; i <= colEnd; i++) {
                System.out.println(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd ; i++) {
                System.out.println(matrix[i][colEnd]);
            }
            colEnd--;



        }

        return list;
    }
}
