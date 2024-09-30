/**
 * PrintNumber
 */

 //print the number N to 1;
package Day2;
public class PrintNumber {

    public static void main(String[] args) {
        int number = 10;
        print(number);
        
    }
    public static void print(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}