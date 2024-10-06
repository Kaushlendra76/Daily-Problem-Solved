package Day3;

/**
 * Min_and_Max
 */
public class Min_and_Max {

    public static void main(String[] args) {
        int []arr = {23,4,1,0,6,7,-1,50};
        System.out.println("The minimum element in the array: " + min(arr));
        System.out.println("The maximum element in the array: " + max(arr));

    }
    static int min(int arr[]){
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }
    static int max(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
            return max;
    }

}