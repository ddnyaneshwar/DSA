package codility;

public class Pair {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1};
        int odd=0;
        for (int i = 1; i < arr.length; i++) {
            odd= arr[(i-1)] ^ arr[i];
        }
        System.out.println(odd);
    }
}
