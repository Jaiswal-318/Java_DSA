public class QuickSort {
    
    public static void main(String args[]){
        int arr[] = {1,3,2,4,5,2,5,7,9};
        int si = 0;
        int ei = arr.length-1;
        quickSort(arr, si, ei);
        for(int i:arr){
          System.out.print(i+" ");
        }
  
      }
      public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
          return;}
          int pivotIdx = partition(arr, si, ei);
          quickSort(arr, si, pivotIdx -1);
          quickSort(arr, pivotIdx+1, ei);
      }
      public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        int j = si;
        while (j < ei) {
          if(arr[j] < pivot){
            i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
          }
          j++;
        }
        i++;
       // int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
  
      }
}
