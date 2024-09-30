package Day2;

public class Fibonaccinumbers {
    public static void main(String[] args) {
        
        System.out.println(fibo(7));
    }
    public static int fibo(int n){
        if(n < 2){ // Base condition 
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
