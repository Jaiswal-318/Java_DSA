package concept.array;

public class Rain_Trapping {
    
    public static void main(String... args){
        int[] h = {4,2,0,6,3,2,5};
        int k = 2;
        System.out.println(h[k+1]);
        TRW(h);}

    public static void TRW(int[] h){
        int n= h.length;
        int[] lmh = new int[n];
        int[] rmh = new int[n];
        
        int[] wl = new int[n];
        int width = 1;
        int TRW = 0;

        lmh[0] = h[0];
        rmh[n-1]= h[n-1];

        for(int i = 1; i<n; i++){
            lmh[i] = Math.max(h[i],lmh[i-1]);}

            for(int i=n-2; i>=0; i--){
                rmh[i] = Math.max(h[i],rmh[i+1]);}

                for(int i = 0;i<n;i++){
                    wl[i] = Math.min(lmh[i], rmh[i]);
                    TRW += (wl[i]-h[i])*width; }

                    System.out.println("Trapped Rain water = " + TRW+" units");}}


       // Another approach
       // 2 pointers Approach
/*
public int trap(int[] height) { 

int n = height.length;
int res = 0, l = 0, r = n - 1;

int rMax = height[r], lMax = height[l];

while (l < r) {
if (lMax < rMax) { l++;
lMax = Math.max(lMax, height[l]); res += lMax - height[l];
} else {
r--;
rMax = Math.max(rMax, height[r]); res += rMax - height[r];
}
}
return res;
} */ 
