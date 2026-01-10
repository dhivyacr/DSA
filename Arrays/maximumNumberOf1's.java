class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
        int r=0,l=0;
        int res=0;
        int z=0;
        while(r<arr.length){
            if(arr[r]==0){
                z++;
            }
            while(z>k){
                if(arr[l]==0)
                z--;
                l++;
            }
            res=Math.max(res,r-l+1);
            r++;
        }
        return res;
    }
}
