/* Given two strings s and t, return true if t is an anagram of s, and false otherwise. */

class Solution {
    public boolean isAnagram(String s, String t) {

        char []ch1=s.toCharArray();
        char []ch2=t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2)) return true;
        else return false;


        
    }
}
