import java.util.Scanner;

/**
 * Created by LENOVO ALMAZEN on 11/01/2022.
 */
public class inputArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
