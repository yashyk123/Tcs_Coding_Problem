import java.util.HashMap;

class SymmetricPair
{
    public static void main(String args[])
    {
         int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};

         HashMap<Integer,Integer> map = new HashMap<>();

         for(int i=0; i<arr.length;i++)
         {
            int first = arr[i][0];
            int second = arr[i][1];
            
            if(map.get(second) != null && map.get(second)==first)
            {
                System.out.println(arr[i][0] + " " + arr[i][1]);
            }
            else
            {
                map.put(first , second);
            }
         }
    }
}