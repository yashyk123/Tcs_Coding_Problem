import java.util.Arrays;

public class ReplaceByRank {
    public static void main(String[] args) {
    int arr[] = {20,15,26,2,98,6};
    int n = arr.length;
    int ans[] = new int[n];
    

    
    for(int i=0; i<n; i++)
    {
   ans[i] = arr[i];
    }
    Arrays.sort(ans);
    System.out.print("sorted array:->");
    for(int i=0; i<n; i++)
    {
        System.out.print(ans[i] + " ");
    }
    System.out.println("\n");

   System.out.print("unsorted array:->");
   for(int i=0; i<n; i++)
    {
        System.out.print(arr[i] + " ");
    }
    System.out.println("\n");
    System.out.print("The Rank of unSorted array according to the sorted array:-> ");
    for(int i=0; i<n; i++)
    {
        for(int j=0;j<n;j++)
        {
            if(arr[i]==ans[j])
            {
                System.out.print(j+1+ " ");
                break;
            }
            
        }
    }
    }


}
