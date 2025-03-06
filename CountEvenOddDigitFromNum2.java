package pack1;



public class CountEvenOddDigitFromNum2 {
    public static void main(String[] args) {
        
        int num = 123456789;
        int odd = 0;
        int even = 0;

        // StringBuilders to store even and odd digits as strings
        StringBuilder evenDigits = new StringBuilder();
        StringBuilder oddDigits = new StringBuilder();

        // Loop through the number
        while (num > 0) {
            int rem = num % 10;  // Get the last digit

            if (rem % 2 == 0) {  // Check if the digit is even
                evenDigits.append(rem);  // Append the even digit to the evenDigits StringBuilder
                even++;  // Increment even count
            } else {  // The digit is odd
                oddDigits.append(rem);  // Append the odd digit to the oddDigits StringBuilder
                odd++;  // Increment odd count
            }

            num = num / 10;  // Remove the last digit from the number
        }

        // Print the results
        System.out.println("Even digits: " + evenDigits.reverse().toString()); // Reverse to display in original order
        System.out.println("Odd digits: " + oddDigits.reverse().toString());   // Reverse to display in original order
        System.out.println("Total even digits: " + even);
        System.out.println("Total odd digits: " + odd);
    }    
}
