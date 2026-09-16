import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90, 5};
        for (int i = 0; i < myArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = myArray[i];
            myArray[i] = myArray[minIndex];
            myArray[minIndex] = temp;
        }
        System.out.println("Sorted Array: " + Arrays.toString(myArray));
    }
}