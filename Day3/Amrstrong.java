package Day3;

public class Amrstrong {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
        
    }
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = Integer.toString(number).length(); // Find the number of digits
        
        // Calculate the sum of each digit raised to the power of the number of digits
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            sum += Math.pow(digit, digits);  // Raise the digit to the power of 'digits' and add to sum
            number /= 10;  // Remove the last digit
        }
        
        // If the sum is equal to the original number, it is an Armstrong number
        return sum == originalNumber;
    }

}
