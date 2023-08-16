import java.util.ArrayList;

public class SubwithsumK {
    public void subwithsumk(int[] a, ArrayList<Integer> lis, int K, int i, int sum){
        if(sum==K){
            for(int j=0;j< lis.size();j++){
                System.out.printf(lis.get(j)+" ");
            }
            System.out.println();
            return;
        }
        if(i==a.length){
            return;

        }

        sum =sum+ a[i];
        lis.add(a[i]);
        subwithsumk(a,lis,K,i+1,sum);
        sum=sum-a[i];
        lis.remove(lis.size()-1);
        subwithsumk(a,lis,K,i+1,sum);
    }
}
