package general;

public class StringReversal {
    public static String reverseExceptSpecialChar(String str, char specialChar) {
        // Convert string to character array
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Skip the special character positions
            if (arr[left] == specialChar) {
                left++;
            } else if (arr[right] == specialChar) {
                right--;
            } else {
                // Swap the characters
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Convert character array back to string
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "ab#cd#ef";
        char specialChar = '#';
        String result = reverseExceptSpecialChar(str, specialChar);
        System.out.println("Reversed string: " + result);
    }
}
