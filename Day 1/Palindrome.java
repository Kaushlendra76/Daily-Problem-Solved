public class Palindrome {
    public static void main(String[] args) {
        System.out.println(Is_Palindrome(12321));

    }
    public static boolean Is_Palindrome(int n ){
        int original = n;
        int rev = 0;
        int rem = 0;
        while (n>0){
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        if (original == rev){
            return  true;
        }
        return  false;
    }
}
