import java.util.HashSet;

public class intersection {
        public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectSet = new HashSet<>();
        
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        
        for (int num : nums2) {
            if (!set1.add(num)) {
                intersectSet.add(num);
            }
            else{
                set1.remove(num);
            }
        }
        
        // Convert HashSet to primitive int array
        int[] result = new int[intersectSet.size()];
        int index = 0;
        for (int num : intersectSet) {
            result[index++] = num;
        }
        
        return result;
    }
}
