package Arrays;
import java.util.Arrays;

public class DataOperation {

    //1.Swaps two elements.
    public static void swap(int[] arr, int i, int j){

        // set the first index in temp variable.
        // Temp holds the first index that we want to change.
        int temp = arr[i];

        // i index is removed and j index set to new position.
        arr[i] = arr[j];

        // j index removed added temp index.
        arr[j] = temp;

    }

    //2.Find Max Item in the array.
    public static int findMax(int[] arr){

        int maxItem = arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if(maxItem < arr[i]){
                maxItem = arr[i];
            }
        }

        return maxItem;
    }

    //3.Find Max Item in the range of an array.
    public static int maxRange(int[]arr, int start, int end){

        if(end > start)
            return -1;

        if(arr == null)
            return -1;

        int maxItem = arr[start];
        for (int i = start; i < end ; i++) {
            if(maxItem < arr[i])
                maxItem = arr[i];
        }
        return maxItem;

    }

    //4.Reverse array.
    public static void reverse(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    //Prints the data.
    public static void printData(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}
