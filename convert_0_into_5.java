//Java program to convert 0 into 5 in the integer

import java.util.*;
class convert
{
     public static void main(String[]args) 
     {
         Scanner obj=new Scanner (System.in);
         int n=obj.nextInt();
         int res=0;
         int x=1;
         while(n>0)
         {
             int a=n%10;
             if(a==0)  a=5;
             res=a*x+res;
             x*=10;
             n/=10;
         }
         System.out.print(res);
     }
}
