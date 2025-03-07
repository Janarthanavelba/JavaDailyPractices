/* Given an array arr of integers, find all the elements that occur more than once in the array. 
If no element repeats, return an empty array. */

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        List<Integer>list=new ArrayList<>();
        HashSet<Integer>set=new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
        {
          if(!set.add(arr[i]))  list.add(arr[i]);
        }
        
        return list;
    }
}
