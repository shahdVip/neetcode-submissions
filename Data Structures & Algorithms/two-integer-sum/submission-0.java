class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>  indecies = new HashMap<Integer,Integer>();
        int diff=0;
        for (int i=0;i<nums.length;i++){
          diff=target-nums[i];
            if(indecies.containsKey(diff)){
              return new int[]{indecies.get(diff), i};
            }
            else{
              indecies.put(nums[i],i);
            }
        }
        return new int[]{};}}
 