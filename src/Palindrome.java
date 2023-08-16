public class Palindrome {
    public boolean isPalindrome(int[] arr,int i){
        if(i>=arr.length/2){
            return true;
        }
        if(arr[i]!=arr[arr.length-i-1]){
            return false;
        }

        return isPalindrome(arr,i+1);

    }
}
