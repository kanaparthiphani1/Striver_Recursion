import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        SumOfFirstNNumbers s = new SumOfFirstNNumbers();
//        int num = s.sumoffirstnnumbers(5);
//        System.out.println(num);

//          ReverseArray r = new ReverseArray();
//          int[] arr = new int[]{1,2,3,4};
//          r.reverseArray(arr,0);
//        System.out.println(Arrays.toString(arr));

//        Palindrome p = new Palindrome();
//        System.out.println(p.isPalindrome(new int[]{1,2,2,2,1},0));

//        Fibanocci f =new Fibanocci();
//        System.out.println(f.nthFibanoci(8));

//        Subsequences s = new Subsequences();
//        s.printAllSubsequences(new int[]{1,2,3}, new ArrayList<Integer>(),0);

//        SubwithsumK k  =new SubwithsumK();
//        k.subwithsumk(new int[]{1,2,3,4,5},new ArrayList<Integer>(),6,0,0);

//        PrintOneSubWithK p = new PrintOneSubWithK();
//        p.subwithsumk(new int[]{1,2,3,4,5},new ArrayList<Integer>(),6,0,0);

//        CountSubWithK c = new CountSubWithK();
//        System.out.println(c.subwithsumk(new int[]{1,2,3,4,5},new ArrayList<Integer>(),6,0,0));

//        MergeSort m = new MergeSort();
//        int[] arr = new int[]{3,1,2,4,1,5,6,2,4};
//        m.mergeSort(arr,0,8);
//        System.out.println(Arrays.toString(arr));

        QuickSort q = new QuickSort();
        int[] arr = new int[]{3,1,2,4};
        q.quickSort(arr,0,3);
        System.out.println(Arrays.toString(arr));
    }
}
