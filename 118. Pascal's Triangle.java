import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        int c = 1;
        List<List<Integer>> aList = new ArrayList<>();
        List<Integer> list = null; // temp for prev row
        for(int i = 0 ; i<numRows ; i++){
            c=1;
             List<Integer> templist = new ArrayList<>();
            for(int j=0 ; j<= i ; j++){
                templist.add(c);
                // System.out.print(c);
                c=(c*(i-j))/(j+1);
            }
            // System.out.println();
            list = templist;
            aList.add(list);
        }
        return aList;
    }
}
