//Given a string s consisting of words and spaces, return the length of the last word in the string.

class Solution {
    public int lengthOfLastWord(String s) {
        
        String ss=s.trim();

        int count=0;

        for(int i=ss.length()-1;i>=0;i--)
        {
            if(ss.charAt(i)==' ')  break;
            count++;
        }

       return count;
    }
}
