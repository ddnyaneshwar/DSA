package leetcode;

public class ClimbingStairs {
    /*
    You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
     */
    public static void main(String[] args) {
        int climbStairs=3;

        int[] stairs=new int[climbStairs+1];

        stairs[1]=1;
        stairs[2]=2;

        for (int i = 3; i < stairs.length; i++) {
            stairs[i]=stairs[i-1]+stairs[i-2];
        }
        System.out.println(stairs[climbStairs]);
    }
}
