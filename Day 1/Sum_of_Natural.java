
// Write a function that returns the sum of first n natural numbers.

public class Sum_of_Natural {
    public static void main(String[] args) {
        System.out.println(Sum(5));

    }
    public static  int Sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
