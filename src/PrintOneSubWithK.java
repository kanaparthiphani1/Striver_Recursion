import java.util.ArrayList;

public class PrintOneSubWithK {
    public boolean subwithsumk(int[] a, ArrayList<Integer> lis, int K, int i, int sum){
        if(i==a.length){
            if(sum==K){
                for(int j=0;j< lis.size();j++){
                    System.out.printf(lis.get(j)+" ");
                }
                System.out.println();
                return true;
            }
            return false;
        }

        sum =sum+ a[i];
        lis.add(a[i]);
        if(subwithsumk(a,lis,K,i+1,sum)==true) return true;
        sum=sum-a[i];
        lis.remove(lis.size()-1);
        if(subwithsumk(a,lis,K,i+1,sum)==true) return true;

        return  false;
    }
}
