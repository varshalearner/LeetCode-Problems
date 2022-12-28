// frequency array is used to solve this problem 
class Solution {
    public int minStoneSum(int[] piles, int k) {
        int ans= 0; 
        int[] freq = new int[(int) 1e5 +1];
        //frequency array created and sum calculated 
        for( int i = 0 ; i < piles.length ; i++ ){
            freq[piles[i]]++;
            ans+=piles[i];
        }
        // performing k operation
        for( int i = (int) 1e5 ; i>0 && k>0 ; i-- ){
            // freq can be greater than 1 that's why while loop is used instead of if 
            while( k>0 && freq[i] > 0 ){
                k--;
                freq[i]--;
                freq[ (int)(i+1)/2]++;
                ans -= (i/2) ;
            }
        }
        
        
        return ans;
    }
}
