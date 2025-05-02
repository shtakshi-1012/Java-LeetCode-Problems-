class Solution {
    public boolean isSubsequence(String s, String t) {
        // base cases
        if(t.length()<s.length() || (s.length()!=0 && t.length()==0))
        return false;
        if(s.length()==0 && t.length()!=0) 
        return true;

        int left=0,right=0,count=0;
        for(int i=0;i<t.length();i++)
        {
            char ch1=s.charAt(left);
            char ch2=t.charAt(right);
            if(ch1==ch2)
            {
                left++;
                right++;
                count++;
            }
            else 
            {
                right++;
            }
            if(count==s.length())
            break;
        }
        if(count==s.length())
        return true;
        return false;
    }
}
