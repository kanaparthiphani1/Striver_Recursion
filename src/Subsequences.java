import java.util.ArrayList;

public class Subsequences {
    public void printAllSubsequences(int[] arr,ArrayList<Integer> lis,int i){
        if(i==arr.length){
            for(int j=0;j< lis.size();j++){
                System.out.printf(lis.get(j)+" ");
            }

            if(lis.isEmpty()){
                System.out.printf("{}");
            }

            System.out.println();
            return;
        }

        lis.add(arr[i]);
        printAllSubsequences(arr,lis,i+1);
        lis.remove(lis.size()-1);
        printAllSubsequences(arr,lis,i+1);
    }
}
