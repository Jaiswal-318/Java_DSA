
public class Sorting {

    public static void b_sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j <n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr [j] = arr[j+1];
                    arr[j+1] = temp;
                }}}System.out.print("By bubble sorting: ");

                for(int i= 0; i<n; i++){
                    System.out.print(arr[i]+" ");
                }
    }
// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
   
public static void s_sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int min_pos = i;
            for(int j = i+1; j<n; j++){
                if(arr[min_pos] > arr[j]){
                    min_pos =j;}
        }
        int temp = arr[i];
        arr[i] = arr[min_pos];
        arr[min_pos] = temp;
        }
        System.out.print("By selection sorting: "); 
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

// &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&


    public static void i_sort(int arr[]){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int now = arr[i];
            int pre = i-1;
            while(pre >=0){
                if(arr[pre] > now){
                    arr[pre+1] = arr[pre];
                    pre--;}
                    else{
                        break;    // this break statement is necessary
                    }
            }
             arr[pre+1] = now;
        }
        System.out.print("Sorting by insertion: ");
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");}
    }


    public static void main(String... args){
        int arr[] = {1,2,2,1,3,3,3,13,53,64};
        b_sort(arr);
        System.out.println();
        s_sort(arr);
        System.out.println();
        i_sort(arr);
    }
}