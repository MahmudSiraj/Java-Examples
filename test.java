import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int remainder = 0;
        int[] indices = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            remainder = target - nums[i];
            for(int j = 0; j < nums.length; j++)
                if(nums[j] == remainder && i != j) { indices[0] = i; indices[1] = j;}
            remainder = 0;
            }
        
        return(indices);
    }
}

class Test{
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums = {2,11,7,15};
        System.out.println(Arrays.toString(test.twoSum(nums, 9)));

    }
}