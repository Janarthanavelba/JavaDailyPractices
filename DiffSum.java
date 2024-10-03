//Day 1(Program 2)

import java.util.*;
class Diffsum 
{
    public static void main(String[]args)
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        int s1=0,s2=0;
        for(int i=1;i<=m;i++)
        {
              if(i%n==0) s1=s1+i;
              else s2=s2+i;
        }
        System.out.print(s2-s1);
    }
}
