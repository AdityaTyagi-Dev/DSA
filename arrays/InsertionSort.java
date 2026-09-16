
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};
        for (int i = 1; i < myArray.length; i++) {
            int insert_index = i;
            int current_value = myArray[i];
            for (int j = i - 1; j > -1; j--) {
                if (myArray[j] > current_value) {
                    myArray[j + 1] = myArray[j];
                    insert_index = j;
                } else {
                    break;
                }
            }
            myArray[insert_index] = current_value;
        }
        System.out.println("Sorted array: " + Arrays.toString(myArray));
    }
}
