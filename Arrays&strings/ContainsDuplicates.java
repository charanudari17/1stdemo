import java.util.HashSet;

public class ContainsDuplicates {

public boolean containsDuplicate(int[] nums) {
    //using set put al ele in the set 
    // check the size of set with  nums array length
    HashSet<Integer> set=new HashSet<>();
    int n=nums.length;
    for(int i=0;i<n;i++){
        set.add(nums[i]);
    }
    return set.size()!=n;}

}

