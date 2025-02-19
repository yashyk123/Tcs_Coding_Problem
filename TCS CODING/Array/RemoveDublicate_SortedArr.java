import java.util.HashSet;

public class RemoveDublicate_SortedArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1,3};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++)
        {
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}
