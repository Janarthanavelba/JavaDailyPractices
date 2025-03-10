/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();

        double res=0;

        for(int i=0;i<nums1.length;i++)
        {
            list.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++)
        {
            list.add(nums2[i]);
        }

        Collections.sort(list);

        if(list.size()%2!=0) res=list.get(list.size()/2);
        else
        {
            int a1=list.get(list.size()/2);
            int a2=list.get(list.size()/2-1);

            res=(double)(a1+a2)/2;
        }

        return res;
    }
}
