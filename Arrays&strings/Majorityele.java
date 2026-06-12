import java.util.HashMap;

public class Majorityele {
 public  int  majorityElement(int[] nums) {
    int ele=-1;
    //using hashmap 
 // put all the ele in map with freq --> run a loop on the ele to check the freq if  f is >n/2 return ele
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
