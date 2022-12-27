class Solution {
    public int mySqrt(int x) {
        if( x==1 ){
            return 1;
        }
        int low = 1;
        int high = x/2;
        while( high > low ){
            int mid = low + (high - low +1 )/2;
            int target = x/mid;
            if( mid == target ){
                return mid;
            } else if( mid > target ){
                high = mid-1;
            } else {
                low = mid;
            }
        }
        return high;
    }
}
