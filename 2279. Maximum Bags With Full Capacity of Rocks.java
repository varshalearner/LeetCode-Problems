class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int maxBag = 0 ;
        ArrayList <Integer> List = new ArrayList<>();
        for( int i = 0 ; i < capacity.length ; i++){
            if( capacity[i] == rocks[i] ){
                maxBag++;//bags with full capacity
            } else {
                List.add(capacity[i]-rocks[i]);//remaining capacity
            }
        }
       
        Collections.sort(List);
        int i = 0;
        int len = List.size();
        while(additionalRocks > 0 && i < len){
            if(additionalRocks >= List.get(i)){
                ++maxBag;
                additionalRocks -= List.get(i);
                ++i;
            }
            else{
                break;
            }
        }
        return maxBag;           
    }
}
