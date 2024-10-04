//Day 2
//Java program to remove duplicate elements in the array
import java.io.*;
import java.util.*;

class removeDuplicate
{

    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        
        ArrayList<Integer> list=new ArrayList<>();
        
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
           int a=obj.nextInt();
           list.add(a);
        }
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(j).equals(list.get(i)))
                {
                    list.remove(j);
                j--;
                 }
            } 
      }  
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
       }
}
