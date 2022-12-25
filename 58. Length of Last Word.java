class Solution {
    public int lengthOfLastWord(String s) {
        String snew = s.trim();
        //removed extra whitespace from both sides
        for( int i = snew.length()-2 ;  i >= 0 ; i-- ){
            if(snew.charAt(i) == ' '){
                //if space found in trimmed string
                return snew.length()-1-i;
            }
        }
        // if space not found in trimmed string
        return snew.length();
    }
}

