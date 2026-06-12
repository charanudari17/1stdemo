public class Sort012duchnational {

    public void sortColors(int[] nums) {
                int n=nums.length;
        int i=0,k=n-1;
        int j=0;
        int temp=0;
        while(j<=k){
            if(nums[j]==0){
             temp=nums[i];
             nums[i]=nums[j];
               nums[j]=temp;
                i++;
                    j++; 
            }
            else if(nums[j]==2){
                temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                k--;
              

            }
            else{
                j++;
            }
        }
    }
}
