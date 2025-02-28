public class Armstrong {
    public static void main(String[] args) {
        int n = 1634;
        int sum = 0;
        int digits = String.valueOf(n).length(); 
        //System.out.println(digits);
     while (n>0)
        {
            int c = n%10;
            sum = sum + (int)Math.pow(c, digits);
            n = n/10;
            System.out.println(c);          
        }
        System.out.println(sum);     /*An Armstrong number is a number that is equal to the sum of its digits, each raised to the power of the number of digits. This means if you take each digit in the number, raise it to the power of the total number of digits, and add them up, you get the original number. */
    }
}
