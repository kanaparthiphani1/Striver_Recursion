public class SumOfFirstNNumbers {
    public int sumoffirstnnumbers(int n){
        if(n==0){
            return 0;
        }
        return n+sumoffirstnnumbers(n-1);
    }
}
