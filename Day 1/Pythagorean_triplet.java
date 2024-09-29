
//Write a function to check if a given triplet is a Pythagorean triplet or not.
//(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

public class Pythagorean_triplet {
    public static void main(String[] args) {
        System.out.println(Is_triplet(3, 4, 5));

    }
    public static  boolean Is_triplet(int a, int b, int c){
        if (c*c == (a*a) + (b*b)){
            return true;
        }
        return false;
    }
}
