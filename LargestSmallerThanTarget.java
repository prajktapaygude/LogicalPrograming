package Array;

public class LargestSmallerThanTarget {
    public static void main(String[] args) {
        int[] arr = {11,10, 4, 9, 15, 2};
        int target = 12;
        
        int largest = -1;  // Initialize largest as -1
        for (int num : arr) {
            if (num < target && num > largest) {
                largest = num;  // Update largest if we find a number smaller than target
            }
        }
        
        System.out.println(largest);  // Print the largest number smaller than target
    }
}
