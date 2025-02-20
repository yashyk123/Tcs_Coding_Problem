import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;

public class RepeatedAndNonRepeatedEle {

    public static void findrepetedEle(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    set.add(arr[i]);
                }
            }
        }
        System.out.println(set);
    }

    public static void findrepetedEleByMap(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.get(i) == null) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        for(java.util.Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey()+ " ");
            }
        }

    }


 public static void findNonrepetedEleByMap(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.get(i) == null) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        for(java.util.Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey()+ " ");
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2, 1 };
        // int count = 0;
        System.out.println("Repeating element are : ");
        findrepetedEle(arr);
        findrepetedEleByMap(arr);

        System.out.println("Non Repeating element are : ");
        findNonrepetedEleByMap(arr);


      
    }
}
