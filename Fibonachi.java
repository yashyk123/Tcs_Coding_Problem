import java.util.ArrayList;

public class Fibonachi {
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>();
        int n = 50;
        int first = 0;
        int sec = 1;

        System.out.print("0 1 ");
        for(int i=2; i<10;i++)
        {
           int thirt = first + sec;
           first = sec;
           sec=thirt;
           System.out.print(thirt +" ");
        }
//0 1 1 2 3 5 8 13 21 34 

    }
}
