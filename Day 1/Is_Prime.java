public class Is_Prime {
    public static void main(String[] args) {
       boolean ans = Is_prime(10);
        System.out.println(ans);
    }
    public static  boolean Is_prime(int n){
        if (n == 0){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return  true;
    }

}
