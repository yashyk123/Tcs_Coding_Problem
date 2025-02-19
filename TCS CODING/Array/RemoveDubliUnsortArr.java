class RemoveDubliUnsortArr
{
    public static void remove(int arr[])
    {
        int n = arr.length;
        int mark[] = new int[n];
        for(int i=0; i<n;i++)
        {
            mark[i] =1;
        }

        for(int i=0; i<n; i++)
        {
            if(mark[i]==1)
            {
                for(int j=i+1; j<n; j++)
                {
                    if(arr[i]==arr[j])
                    {
                        mark[j] = 0;
                    }
                }
            }
        }

        for(int i=0; i<n;i++)
        {
            if(mark[i]==1)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 9,4,8,5,4,3};
        remove(arr);
    }
}