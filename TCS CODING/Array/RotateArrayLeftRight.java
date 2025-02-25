import java.util.Stack;

public class RotateArrayLeftRight {

    public static void rotateLeft(int arr[],int n, int k)
    {
        int ans[] = new int[n];
        int i=0;
        for(int j=k; j<n;j++)
        {
         ans[i]=arr[j];
         i++;
        }
 
        i=0;
     
     for(int j=n-k; j<n; j++)
     {
         ans[j] =arr[i];
         i++;
     }
     
     
     for(int j=0; j<n;j++)
     {
         System.out.print(ans[j] + " ");
     }
    }

    public static void rotateRight(int arr[] ,int k, int n)
    {
        int ans[] = new int[n];
        int i=n-k;
        for(int j=0; j<k;j++)
        {
         ans[j]=arr[i];
         i++;
        }
 
        
        i=k;
        for(int j=0; j<n-k; j++)
        {
            ans[i] =arr[j];
            i++;
        }
     
     
     for(int j=0; j<n;j++)
     {
         System.out.print(ans[j] + " ");
     }
    }

    // public static void rotateRightBySwap(int arr[], int n, int k)
    // {
       
            
    //         //System.out.println("Rotated Array: " + Arrays.toString(arr));
       

    //         k = k % n; // Handle cases where k > n
            
    //         reverse(arr, 0, k - 1);   // Reverse first k elements
    //         reverse(arr, k, n - 1);   // Reverse remaining elements
    //         reverse(arr, 0, n - 1);   // Reverse whole array
    //     }
    
    //     public static void reverse(int[] arr, int start, int end) {
    //         while (start < end) {
    //             int temp = arr[start];
    //             arr[start] = arr[end];
    //             arr[end] = temp;
    //             start++;
    //             end--;
    //         }
    //     }
    
    
    
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 2;
        int n = arr.length;
        System.out.println("Original arr : [1,2,3,4,5,6,7]");
        System.out.print("rotate left:->");
        rotateLeft(arr, n, k);
        System.out.print("rotate right:->");
        rotateRight(arr, k, n);
  

    /*
     Another approach

      public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        
        rotateLeft(arr, k);
        
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        
        reverse(arr, 0, k - 1);   // Reverse first k elements
        reverse(arr, k, n - 1);   // Reverse remaining elements
        reverse(arr, 0, n - 1);   // Reverse whole array
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
     */
    
    }
}
