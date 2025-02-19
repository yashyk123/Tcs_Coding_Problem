import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 1, 2, 5, 6,3 };

        Arrays.sort(arr);
        int n = arr.length;
        int ind0 = n/2-1;
        int ind1 = n/2;
        if (n % 2 == 0) {
            System.out.println((arr[ind0] + arr[ind1]) / 2.0);
        } else {
            System.out.println(arr[n / 2]);
        }
    }
}
