import java.util.ArrayList;

public class CountSubWithK {
    public int subwithsumk(int[] a, ArrayList<Integer> lis, int K, int i, int sum){

        if(i==a.length){
            if(sum==K){
                return 1;
            }
            return 0;
        }

        sum =sum+ a[i];
        lis.add(a[i]);
        int with = subwithsumk(a,lis,K,i+1,sum);

        sum=sum-a[i];
        lis.remove(lis.size()-1);
        int without = subwithsumk(a,lis,K,i+1,sum);

        return with+without;
    }
}
