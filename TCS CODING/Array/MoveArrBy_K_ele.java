public class MoveArrBy_K_ele {

    public void MoveArr(int arr[],int k)
    {
        int n = arr.length;
        int ans[] = new int[n];
       
        int a =0;
        
        for(int i=k; i<n;i++)
        {
            ans[a] = arr[i];
            a++;
        }

        a=0;
        for(int i=n-k; i<n;i++)
        {
            ans[i] = arr[a];
            a++;
        }
        //System.out.println(arr[a]);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int K=4;
        MoveArrBy_K_ele move = new MoveArrBy_K_ele();
        move.MoveArr(array,K);

    }
}
