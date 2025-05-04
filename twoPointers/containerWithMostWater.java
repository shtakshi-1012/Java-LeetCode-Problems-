class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int mxa=Integer.MIN_VALUE;
        while(left<right)
        {
            int min=Math.min(height[left],height[right]);
            int dis=right-left;
            mxa=Math.max(mxa,min*dis);

            if(height[left]<height[right])
            {
                left++;
            }
            else
            right--;
        }
        return mxa;

    }
}
