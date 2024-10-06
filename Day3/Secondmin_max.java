package Day3;

public class Secondmin_max {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 4, 5, 0, -1};
        System.out.println("Second minimum: " + second_min(arr));
    }
    
    static int second_min(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array has less than 2 elements.");
            return Integer.MAX_VALUE; // Return a large value or some indicator that second min doesn't exist
        }
        
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        
        // First loop: Find the minimum element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        // Second loop: Find the second minimum element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < second_min) {
                second_min = arr[i];
            }
        }
        
        // Check if second_min was updated
        if (second_min == Integer.MAX_VALUE) {
            System.out.println("There is no second minimum element.");
            return min;  // If no second min exists, you can return the minimum or handle the case accordingly
        }
        
        return second_min;
    }
    // static int second_min(int[] arr) {
    //     Write teh code of the second_min method yourself sae as above only change the conditions.
    //     }
}
