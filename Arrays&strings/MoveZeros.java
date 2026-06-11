class MoveZeros {
      public void moveZeroes(int[] nums) {
        int j=0;
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c++;
                // i++;

            }
            else{

                nums[j]=nums[i];
                j++;

            }
        }
        for(int i=n-c;i<n;i++)
        {
            nums[i]=0;
        }
    }
}