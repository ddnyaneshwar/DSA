package codility;

import java.util.Arrays;
import java.util.Scanner;

public class VendingMachine {

    static int[] getChange(double amount, double purchase) {
        final int[] denominations = {1, 5, 10, 25, 50, 100};
        int[] res = new int[denominations.length];
        int change = (int)((amount - purchase) * 100);
        for (int i = denominations.length-1; i >= 0; i--) {
            res[i] = change / denominations[i];
            change %= denominations[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        double amount = sc.nextDouble();
        double purchase = sc.nextDouble();
        sc.close();
        System.out.println("Change: " + Arrays.toString(getChange(amount, purchase)));
    }
}