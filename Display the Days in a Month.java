/* Problem Statement
      Write a program to find the number of days in a given month of a given year.
      The month and year are given as input, and the number of days in that month is displayed as output. */

import java.util.*;
class java
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        int month=obj.nextInt();
        int year=obj.nextInt();
        
        if(month!=2)
        {
            if(month<=7)
            {
                if(month%2!=0) System.out.print("Number of days is 31");
                else System.out.print("Number of days is 30");
            }
            else
            {
                if(month%2==0) System.out.print("Number of days is 31");
                else System.out.print("Number of days is 30");
            }
        }
        else
        {
            if(year%4==0 && year%100!=0 || year%400==0)
            {
                System.out.print("Number of days is 29");
            }
            else
            {
                System.out.print("Number of days is 28");
            }
        }
    }
}
