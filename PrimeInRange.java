//Java Program to print a range of prime numbers 

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                  if(i%j==0) c++;
            }
            if(c==2) System.out.print(i+" ");
        }
    }
}
