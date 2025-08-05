class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int first=-1,second=-1;
        for(int i:arr){
            if(i>first){
                second=first;
                first=i;
                }
            else if(i>second && i!=first){
                second=i;
            }
        }
        return second;
    }
}
