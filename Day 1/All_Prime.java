
// Write a function that returns all prime numbers between two given numbers

public class All_Prime {
    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        print_prime(first,second);


    }
    public static  boolean Is_prime(int n){
        for (int i = 2; i < n; i++) {
            if ( n % i == 0){
                return  false;
            }
        }
        return  true;
    }
    public static void print_prime(int first, int second ){
        for (int i = first; i <= second ; i++) {
            if (Is_prime(i) == true){
                System.out.println(i);
            }
        }
    }
}
