public class ReverseArray {
    public void reverseArray(int[] arr,int i){
        if(i>=arr.length/2){
            return;
        }
        int temp  = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        reverseArray(arr,i+1);
    }
}
