package Day2;

public class PrintNumber2 {
    public static void main(String[] args) {
        printNumbers(5);
        
    }
    public static void printNumbers(int n) {
        // Base case
        if (n <= 0) {
            return;
        }

        // Recursive call
        printNumbers(n - 1);
        
        // Print the current number after the recursive call
        System.out.println(n);
    }

}
