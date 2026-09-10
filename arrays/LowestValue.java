
import java.util.Scanner;

public class LowestValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int minVal = arr[0];
        for (int item : arr) {
            if (item < minVal){
                minVal = item;
            }
        }
        System.out.println("Lowest value: " + minVal);
    }
}