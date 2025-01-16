public class MergeSort {
    
    public static void main(String args[]){
        int arr[] = {1,2,4,256,7,4,6,3,8,2};
        int si = 0;
        int ei = arr.length-1;
        divide(arr, si, ei);
        for(int i: arr){
          System.out.print(i+" ");
        }
  
        
      }
  
      public static void divide(int arr[], int si,int ei){
        if(si>=ei)
        return;
        int mid  = si+ (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
  
      }
  
      public static void conquer(int arr[],int si, int mid, int ei){
        int temp [] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
  
        while(i<=mid && j <= ei){
          if (arr[i]<arr[j]) {
            temp[k++] = arr[i++];
          }else{
            temp[k++] = arr[j++];
          }
  
        }
        while (i<= mid) {
          temp[k++] = arr[i++];
        }
        while (j <= ei) {
          temp[k++] = arr[j++];
        }
        for(k=0,i = si;k<temp.length;k++,i++){
          arr[i] = temp[k];
        }
      }
}


// public class MergeSort {

//   public static void main(String args[]){
//     String arr[] = {"sun", "earth", "mars", "mercury"};
//     int si = 0;
//     int ei = arr.length-1;
//     mergeSort(arr, si, ei);
//     for(String i:arr){
//       System.out.println(i);
//     }

//   }
//   public static void mergeSort(String arr[], int si, int ei){
//     if(si>=ei){
//       return;
//     }
    
//     int mid = (si+ei)/2;
//     mergeSort(arr, si, mid);
//     mergeSort(arr, mid+1, ei);
//     join(arr, si, mid, ei);

//   }
//   public static void join(String arr[], int si,int mid ,int ei){
//     String temp [] = new String[ei -si +1];
    
//     int i = si;
//     int j = mid + 1;
//     int k = 0;
//     while(i <= mid && j <= ei){
//       if(arr[i].compareTo(arr[j])<0){
//         temp[k++] = arr[i++];
//       }else{
//         temp[k++] = arr[j++];
//       }
//     }
//     while (i<=mid) {
//       temp[k++] = arr[i++];
//     }
//     while (j<=ei) {
//       temp[k++] = arr[j++];
//     }

//     for(k=0,i = si;k<temp.length;k++,i++){
//       arr[i] = temp[k];
//     }
//   }
//     }
