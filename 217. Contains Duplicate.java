//1 solution using Hash Set

class Solution {
    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i<n ;i++){
            if(set.contains(nums[i])){ //first it will check weather element is in set
            return true; //if found second time it will return true
            }
            else{
            set.add(nums[i]); // if not found it will add in set 
            }
        } return false;
    }
}
      
      
// 2 solution using interation and if statement

class Solution {
    public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for(int i = 0 ; i <nums.length-1;i++){
         if(nums[i]==nums[i+1]){
            return true;
            }
        }
        return false;
    }
}

      
