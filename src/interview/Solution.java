package interview;/*
You are reading a Build Your Own Story book. It is like a normal book except that choices on some pages affect the story, sending you to one of two options for your next page.

You start reading at page 1 and read forward one page at a time unless you reach a choice or an ending.

The choices are provided in a list, sorted by the page containing the choice, and each choice has two options of pages to go to next. In this example, you are on page 3, where there is a choice. Option 1 goes to page 7 and Option 2 goes to page 8.

choices1_1 = [[3, 7, 8], [9, 4, 2]] => [[current_page, option_1, option_2], ...]
The ending pages are also given in a sorted list:

endings1 = [6, 15, 21, 30]

These choices are really stressing you out, so you decide that you'll either always pick the first option, or always pick the second option.

Given a list of endings, a list of choices with their options, and the choice you will always take (Option 1 or Option 2), return the ending you will reach. If you get stuck in a loop, return -1.

Example:
stories(endings1, choices1_1, 1) (always Option 1)
  Start: 1 -> 2 -> 3(choice) -> 7 -> 8 -> 9(choice) -> 4 -> 5 -> 6(end) => Return 6

stories(endings1, choices1_1, 2) (always Option 2)
  Start: 1 -> 2 -> 3(choice) -> 8 -> 9(choice) -> 2 -> 3(choice) -> 8 ... => Return -1

Additional inputs:
choices1_2 = [[3, 14, 2]]
choices1_3 = [[5, 11, 28], [9, 19, 29], [14, 16, 20], [18, 7, 22], [25, 6, 30]]
choices1_4 = [[2, 10, 15], [3, 4, 10], [4, 3, 15], [10, 3, 15]]

endings2 = [11]
choices2_1 = [[2, 3, 4], [5, 10, 2]]
choices2_2 = []

endings3 = [4, 11]
choices3_1 = [[10, 6, 8]]

endings4 = [20]
choices4_1 = [[2,6,3], [3,1,4], [4,10,5], [6,3,7]]

Complexity Variable:
n = number of pages
(endings and choices are bound by the number of pages)

All Test Cases :
System.out.println(stories(endings1, choices1_1, 1));// => 6
System.out.println(stories(endings1, choices1_1, 2));// => -1
System.out.println(stories(endings1, choices1_2, 1));// => 15
System.out.println(stories(endings1, choices1_2, 2));// => -1
System.out.println(stories(endings1, choices1_3, 1));// => 21
System.out.println(stories(endings1, choices1_3, 2) );//=> 30
System.out.println(stories(endings1, choices1_4, 1));// => -1
System.out.println(stories(endings1, choices1_4, 2) );//=> 15
System.out.println(stories(endings2, choices2_1, 1) );//=> 11
System.out.println(stories(endings2, choices2_1, 2));// => -1
System.out.println(stories(endings2, choices2_2, 1));// => 11
System.out.println(stories(endings2, choices2_2, 2));// => 11
System.out.println(stories(endings3, choices3_1, 1));// => 4
System.out.println(stories(endings3, choices3_1, 2));// => 4
System.out.println(stories(endings4, choices4_1, 1) );//=> -1



endings4 = [20]
choices4_1 = [[2,6,3], [3,1,4], [4,10,5], [6,3,7]]
option 1

Visited: 1,2,6,3

Loop: 
1-2 

2- > [2,6,3]
6- > [6,3,7]


*/
import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] argv) {
    int[] endings1 = {6, 15, 21, 30};
    int[][] choices1_1 = {
      {3, 7, 8},
      {9, 4, 2},
    };
    int[][] choices1_2 = {
      {3, 14, 2},
    };
    int[][] choices1_3 = {
      {5, 11, 28},
      {9, 19, 29},
      {14, 16, 20},
      {18, 7, 22},
      {25, 6, 30},
    };
    int[][] choices1_4 = {
      {2, 10, 15},
      {3, 4, 10},
      {4, 3, 15},
      {10, 3, 15},
    };

    int[] endings2 = {11};
    int[][] choices2_1 = {
      {2, 3, 4},
      {5, 10, 2},
    };
    int[][] choices2_2 = {};

    int[] endings3 = {4, 11};
    int[][] choices3_1 = {
      {10, 6, 8},
    };

    int[] endings4 = {20};
    int[][] choices4_1 = {
      {2, 6, 3},
      {3, 1, 4},
      {4, 10, 5},
      {6, 3, 7}
    };
    
    System.out.println(stories(endings1, choices1_1, 1));// => 6
System.out.println(stories(endings1, choices1_1, 2));// => -1
System.out.println(stories(endings1, choices1_2, 1));// => 15
System.out.println(stories(endings1, choices1_2, 2));// => -1
System.out.println(stories(endings1, choices1_3, 1));// => 21
System.out.println(stories(endings1, choices1_3, 2) );//=> 30
System.out.println(stories(endings1, choices1_4, 1));// => -1
System.out.println(stories(endings1, choices1_4, 2) );//=> 15
System.out.println(stories(endings2, choices2_1, 1) );//=> 11
System.out.println(stories(endings2, choices2_1, 2));// => -1
System.out.println(stories(endings2, choices2_2, 1));// => 11
System.out.println(stories(endings2, choices2_2, 2));// => 11
System.out.println(stories(endings3, choices3_1, 1));// => 4
System.out.println(stories(endings3, choices3_1, 2));// => 4
System.out.println(stories(endings4, choices4_1, 1) );//=> -1


  }
  
  public static int stories(int[] endings,int[][] choices, int option ){
    Set<Integer> endingSet = new HashSet<>();
        for (int ending : endings) {
            endingSet.add(ending);
        }

        Map<Integer, int[]> choiceMap = new HashMap<>();
        for (int[] choice : choices) {
            choiceMap.put(choice[0], new int[]{choice[1], choice[2]});
        }

        Set<Integer> visited = new HashSet<>();
        int currentPage = 1;

        while (!visited.contains(currentPage)) {
            if (endingSet.contains(currentPage)) {
                return currentPage;
            }

            visited.add(currentPage);

            if (choiceMap.containsKey(currentPage)) {
                currentPage = choiceMap.get(currentPage)[option - 1];
            } else {
                currentPage++;
            }
        }

        return -1;
  }
}
