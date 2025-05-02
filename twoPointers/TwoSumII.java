class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int fir=0,sec=numbers.length-1;
        int ans[]=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
            if((numbers[fir]+numbers[sec])>target)
            {
                if(numbers[fir]>numbers[sec])
                fir++;
                else
                sec--;
            }
            else if((numbers[fir]+numbers[sec])<target)
            {
                if(numbers[fir]<numbers[sec])
                fir++;
                else
                sec--;
            }
            else
            {
                ans[0]=++fir;
                ans[1]=++sec;
                break;
            }
        }
        return ans;
    }
}
