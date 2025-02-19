public class Split {
    public static void main(String[] args) {
        char vovels[] = {'a','e','i','o','u','A','E','I','O','U'};
        String str = "HelloWorld";
        int len = str.length();

        int mid = len/2;
        String first = str.substring(0, mid);
        String sec = str.substring(mid);
        // System.out.println(first);
        // System.out.println(sec);

        int cnt1=0;
        int cnt2=0;

        for(int i=0;i<first.length();i++)
        {
            for(int j=0;j<vovels.length;j++)
            {
                if(first.charAt(i)==vovels[j])
                {
                    cnt1++;
                }
            }
        }

        for(int i=0;i<sec.length();i++)
        {
            for(int j=0;j<vovels.length;j++)
            {
                if(sec.charAt(i)==vovels[j])
                {
                    cnt2++;
                }
            }
        }

        System.out.println(cnt1);
        System.out.println(cnt2);
    }
}
