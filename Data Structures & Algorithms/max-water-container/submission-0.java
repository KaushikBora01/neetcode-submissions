class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int s=0;
        int l=heights.length-1;
        while(s<l){
            int ans= (l-s)*Math.min(heights[s],heights[l]);
            if(ans>max){
                max=ans;

            }
            if(heights[s]<=heights[l]){
                s++;
            }
            else{
                l--;
            }
        }
        return max;
    }
}
