
//Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
// E.g.-
// 4! = 1 * 2 * 3 * 4 = 24
// 3! = 3 * 2 * 1 = 6
// 2! = 2 * 1 = 2
// Also, 1! = 1
// 0! = 1


public class Factorial {
    public static void main(String[] args) {
        int ans = factorial(4);
        System.out.println(ans);

    }
     public static  int factorial(int n){
        if (n == 0){
            return  1;
        }
        int fact = 1;
        for ( int i =1; i <= n; i++){
           fact = fact * i;
        }
        return  fact;
     }
}
