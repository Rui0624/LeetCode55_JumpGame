
public class Solution {
	public boolean canJump(int[] nums) {
        int m = nums.length;
        int maxIdx = 0;
        
        for(int i = 0; i < m; i++){
        	if(maxIdx >= m -1 || i > maxIdx)
        		break;
        	
        	maxIdx = Math.max(maxIdx, i + nums[i]);
        }
        
        return maxIdx >= m - 1;
    }
}
