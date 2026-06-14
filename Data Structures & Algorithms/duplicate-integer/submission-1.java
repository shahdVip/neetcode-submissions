class Solution {
    public boolean hasDuplicate(int[] nums) {
    int[] hash = nums;
    for(int i = 0 ;i<nums.length;i++){
      for(int j = i + 1;j<nums.length;j++){
      if(  nums[i] == hash[j]){
      return true;
      }}
    }
    return false;
    }
    }