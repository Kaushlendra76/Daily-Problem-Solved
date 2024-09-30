package Day2;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 12345; // You can change this value to test with other numbers
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigits(int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }

        // Recursive case: add the last digit to the sum of the remaining digits
        return (n % 10) + sumOfDigits(n / 10);
    }
}
