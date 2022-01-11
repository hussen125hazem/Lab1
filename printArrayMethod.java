/**
 * Created by LENOVO ALMAZEN on 11/01/2022.
 */
public class printArrayMethod {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        print(arr);
    }
    public static void print(int[] a)
    {
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}
