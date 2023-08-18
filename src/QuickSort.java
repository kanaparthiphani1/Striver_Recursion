public class QuickSort {

    public int getPartitionInd(int[] arr, int low, int high){
        int i=low;
        int j=high;
        int pivot = arr[low];

        while(i<j){
            while(arr[i]<=pivot && i<high){
                i++;
            }
            while(arr[j]>pivot && j>low){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = pivot;
        arr[low] = temp;

        return j;
    }

    public void quickSort(int[] arr, int low, int high){
        if(low<high){
            int partition = getPartitionInd(arr, low, high);
            quickSort(arr,low, partition-1);
            quickSort(arr,partition+1,high);

        }
    }
}
