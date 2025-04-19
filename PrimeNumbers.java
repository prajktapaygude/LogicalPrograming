package NumberSeries;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Prime numbers between 1 and " + n + " are:");

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
/*
Outer Loop Iteration:

The outer loop starts at num = 2 and increments up to n. For each value of num, it initiates the inner loop to check its primality.
Inner Loop Execution:

For each value of num, the inner loop runs from 2 up to num - 1.
If num is divisible by any number in this range, isPrime is set to false, and the loop breaks early to avoid unnecessary checks.
Prime Check:

After the inner loop completes (or breaks), if isPrime is still true, it means no divisors were found other than 1 and num itself. Therefore, num is a prime number.
The number is then printed out.
 */