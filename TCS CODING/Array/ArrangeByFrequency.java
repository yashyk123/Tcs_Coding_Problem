import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class ArrangeByFrequency {

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,3,1,2};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i], 1);
            }        
            
        }
        System.out.println(map);
        for(Map.Entry<Integer, Integer> e: map.entrySet())
        {
            System.out.println("frequecy: " + e.getValue());
        }

        
        for(Map.Entry<Integer,Integer> a: map.entrySet())
        {
            for(int j=0; j<a.getValue();j++)
            {
                System.out.print(a.getKey()+ " ");
            }
        }
    }
}