import java.util.Arrays;

public class RearrangeArrIncDecOrder {

    public void RearrangArray(int arr[])
    {
        int n = arr.length;
        Arrays.sort(arr); //1 5 6 7 8 9 
        int ans[] = new int[n];
        // for(int i=0; i<n; i++)
        // {
        //     System.out.print(arr[i] + " ");
        // }

        for(int i=0; i<n/2;i++)
        {
            ans[i] = arr[i];
        }

        

        int a=n/2;
            for(int j=n-1; j>=n/2;j--)
            {
                ans[a] = arr[j];
                a++;            
            }
        

        for(int i=0; i<n; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {8, 7, 1, 6, 5, 9};
        RearrangeArrIncDecOrder a = new RearrangeArrIncDecOrder();
        a.RearrangArray(arr);
    }
}
