import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public void ByUsingbooleanArr(int arr[])
    {
       int n = arr.length;
       boolean a[] = new boolean[n];

       for(int i=0; i<n; i++)
       {
        if(a[i]==true)
        {
            continue;
        }
        int count = 1;

        for(int j=i+1; j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                a[j]=true;
                count++;
            }
        }
        System.out.println(arr[i]+" "+count);
       }

    }


    public void ByusingMap(int arr[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            System.out.println("key: " + e.getKey()+" "+"frequency: " +e.getValue());
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3,1,1};
        FrequencyCount obj = new FrequencyCount();
        obj.ByUsingbooleanArr(arr);
        obj.ByusingMap(arr);
    }
}
