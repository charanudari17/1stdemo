public class MaxProductSubarray {
    public int MaxProductSubarray1(int []nums){
        // using n*2
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                p*=nums[j];
                ans=Math.max(ans,p);

        }
    }
    return ans;
}
public int MaxProductSubarray2(int [] nums){
   //using dp
      
}
}
