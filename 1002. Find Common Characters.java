import java.util.*;
class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[] arr = new int[26];
        Arrays.fill(arr, Integer.MAX_VALUE);
        for( int i = 0 ; i< words.length ; i++ ){
            maintainFrequencyArr(words[i] , i+1 , arr );
        }
        for( int i = 0 ; i<26 ; i++){
            while(arr[i]-->0) list.add(Character.toString((char)(i+97)));//adding character to list
        }
        return list;
    }
    private static void maintainFrequencyArr(String str , int freq , int[] arr ){
        int[] cnt = new int[26];
        for(int i = 0 ; i< str.length() ; i++) cnt[str.charAt(i)-97]++;//current word --> character frequency
        for( int i = 0 ; i<26 ; i++){
            arr[i]= Math.min(cnt[i], arr[i]); 
          
        }
    }
}
// Given a string array words, 
// return an array of all characters that show up in all strings within the words (including duplicates).
// You may return the answer in any order.
// Example 1:

// Input: words = ["bella","label","roller"]
// Output: ["e","l","l"]
// Example 2:

// Input: words = ["cool","lock","cook"]
// Output: ["c","o"]
 

// Constraints:

// 1 <= words.length <= 100
// 1 <= words[i].length <= 100
// words[i] consists of lowercase English letters.
