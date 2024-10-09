//Java program to find the missing numbers in the array
import java.util.*;
class array
{
     public static void main(String[]args) 
     {
         Scanner obj=new Scanner (System.in);
         HashSet<Integer>set=new HashSet<>();
         int n=obj.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
            arr[i]=obj.nextInt();
         }
         Arrays.sort(arr);
         for(int i=0;i<n;i++)
         {
            set.add(arr[i]);
         }
         int s=arr[0];
         int e=arr[n-1];
         for(int i=s;i<=e;i++)
         {
            if(!set.contains(i)) System.out.print(i+" ");
         }
     }
}
