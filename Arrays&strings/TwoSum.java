import java.util.HashMap;
public class TwoSum {
 public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
    int x=0;
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<n;i++){
        x=target-nums[i];
        if(map.containsKey(x)){
            return new int []{map.get(x),i};
        }
        map.put(nums[i],i);

    }

        return new int []{};
    }
}