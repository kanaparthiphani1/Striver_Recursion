public class Fibanocci {
    public int nthFibanoci(int n){
        if(n<=1){
            return n;
        }

        return nthFibanoci(n-1) + nthFibanoci(n-2);
    }
}
