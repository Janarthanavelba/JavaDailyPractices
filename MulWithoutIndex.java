//Java program to Multiply elements in the array without index element. 
import java.util.*;
class array
{
     public static void main(String[]args) 
     {
         Scanner obj=new Scanner (System.in);
         int n=obj.nextInt();
         int arr[]=new int[n];
         int res[]=new int[n];
         for(int i=0;i<n;i++)
         {
            arr[i]=obj.nextInt();
            res[i]=1;
         }

         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
               if(i!=j) 
               {
               res[i]=res[i]*arr[j];
               }
           }
         }
         for(int i=0;i<n;i++)
         {
            System.out.print(res[i]+" ");
         }
     }
}
