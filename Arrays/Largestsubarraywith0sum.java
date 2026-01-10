class Solution {
    int maxLength(int arr[]) {
        // code here ml=maximum length
        int ml=0;
        int n=arr.length;
        int sum=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0)
            ml=i+1;
            else{
                if(map.containsKey(sum)){
                    ml = Math.max(ml,i-map.get(sum));
                }
                else
                map.put(sum,i);
            }
        }
         return ml;
    }
}
