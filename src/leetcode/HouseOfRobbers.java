package leetcode;

public class HouseOfRobbers {
    public static void main(String[] args) {
        int[] wealth={2,7,9,3,1};
        int maxRobbedMoney= robFrom(wealth,0);
        System.out.println(maxRobbedMoney);
    }

    private static int robFrom(int[] wealth, int currentIndex) {
       if (wealth.length<=0 || currentIndex>= wealth.length) return 0;
       int robCurrentHouse=wealth[currentIndex]+robFrom(wealth,currentIndex+2);
       int robNextHouse=robFrom(wealth,currentIndex+1);
       return Math.max(robCurrentHouse,robNextHouse);
    }
}
