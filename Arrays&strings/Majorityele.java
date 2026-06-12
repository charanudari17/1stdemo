import java.util.HashMap;

public class Majorityele {
 public  int  majorityElement(int[] nums) {
    int ele=-1;
    //using hashmap
HashMap<Integer,Integer> map=new HashMap<>();
int n=nums.length;
for(int i=0;i<n;i++){
  map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }  
    for(int i=0;i<n;i++){
        if(n/2<map.get(nums[i])){
            ele=nums[i];
            break;
            
        }
    }
    return ele;
}
}
