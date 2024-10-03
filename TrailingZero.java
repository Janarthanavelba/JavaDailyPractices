//Day 1(Program 3)

import java.util.*;
class trailingZero 
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner (System.in);
        int n=obj.nextInt();
        int m=5;
        int k=0,sum=0;
        if(n<m) System.out.print("0");
        else
        {
        while(n>=m)
        {
            k=n/m;
            sum=sum+k;
            m=m*5;
        }
        System.out.print(sum);
       }
    }
}
