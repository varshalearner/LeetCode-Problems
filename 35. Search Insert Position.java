class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0 ;
        for( int i = 0 ; i < nums.length ; i+=1 ) {
            if( nums[i] == target ) {
                return i;
            } else if( nums[i] < target ) {
                if(i==nums.length-1) return ++i;
               continue;
            } else {
                // when target not found
                return i;
            }
        } 
        return index;
    }
}
