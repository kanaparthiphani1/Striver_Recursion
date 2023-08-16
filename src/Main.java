import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        SumOfFirstNNumbers s = new SumOfFirstNNumbers();
//        int num = s.sumoffirstnnumbers(5);
//        System.out.println(num);

          ReverseArray r = new ReverseArray();
          int[] arr = new int[]{1,2,3,4};
          r.reverseArray(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
