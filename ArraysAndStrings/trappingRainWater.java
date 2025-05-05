class Solution {
    public int trap(int[] height) {
        //calculating left max
        int n=height.length;
        int left[]=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(height[i],left[i-1]);
        }
        //calculate right max 
        int right[]=new int[n];
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(height[i],right[i+1]);
        }
        //calculating water level
        int trpwt=0;
        for(int i=0;i<n;i++)
        {
            int waterLevel=Math.min(right[i],left[i]);
            trpwt+=waterLevel-height[i];
        }
        return trpwt;
    }
}
