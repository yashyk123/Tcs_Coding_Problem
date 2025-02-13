import java.util.Arrays;

public class SecondSmallAndLargeEle {

    public int FindSecLarge(int a[])
    {
        Arrays.sort(a);
        int secLarge = a[a.length - 2];
        return secLarge;
    }

    public int FindSecSmall(int a[])
    {
        Arrays.sort(a);
        int secSmall = a[1];
        return secSmall;
    }


    public int[] ByusingCondition(int arr[])
    {
        if(arr.length==0 || arr.length==1)
        {
            return new int[] {-1,-1};
        }

        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for(int i=0;i < arr.length;i++)
        {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < secSmall && arr[i]!=small)
            {
                secSmall = arr[i];
            }
            if(arr[i] > secLarge && arr[i]!=large)
            {
                secLarge = arr[i];
            }
        }

        return new int[] {secSmall, secLarge};
    }
    public static void main(String[] args) {
        int arr[] ={1,2,4,7,7,5};
        SecondSmallAndLargeEle obj = new SecondSmallAndLargeEle();
        System.out.println("Second largest element is: "+obj.FindSecLarge(arr));
        System.out.println("Second smallest element is: "+obj.FindSecSmall(arr));

        System.out.println("Second smallest and Second largest element is: "+ Arrays.toString(obj.ByusingCondition(arr)));

    }
}
