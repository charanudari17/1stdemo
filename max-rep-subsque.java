// "aaaba   aaab      —-aaaba.  aaaba  aaaba  aaaba  aaaba"
 
// 1             2      3             4         5       6                
//                     1—————                       ————5        
class Solution {
    public int maxRepeating(String S, String word) {
        int c=0;
        String temp=word;
        while(S.contains(temp)){
            c++;
            temp=temp+word;
        }
        return c;
        
    }
}
