//Java program to count negative elements in the array.

import java.util.*;
class array {
    public static void main(String[]args)
    {
         Scanner obj=new Scanner (System.in);
         int n=obj.nextInt();
         int arr[]=new int [n];
         for(int i=0;i<n;i++)
         {
            arr[i]=obj.nextInt();
         }
         int c=0;
         for(int i=0;i<n;i++)
         {
            if(arr[i]<0) c++;
         }
         System.out.print(c);
    }

}
