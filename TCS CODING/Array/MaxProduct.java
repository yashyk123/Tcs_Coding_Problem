public class MaxProduct {
    public static int subarrayWithMaxProduct(int arr[])
    {
        int n = arr.length;
        int MaxProduct = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            int product = 1;
            for(int j=i; j<n; j++)
            {
                product *= arr[j];

                MaxProduct = Math.max(MaxProduct, product);
            }
        }
        return MaxProduct;

    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum product subarray: " + subarrayWithMaxProduct(arr));
    }
}
