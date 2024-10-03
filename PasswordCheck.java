//Day 1
// JAVA program to check the password is Valid or Not.

import java.util.*;
class PassCheck
{
    public static void main(String[]args)
    {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();

        char []ch=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            ch[i]=str.charAt(i);
        }

         int z=str.length();

        int num=0,cap=0,space=0,Fnum=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(ch[i]))  num++;
            if(ch[i]==' '||ch[i]=='/') space++;
            if(Character.isUpperCase(ch[i])) cap++;
            if(Character.isDigit(ch[0]) ) Fnum++;
        }
        if(z>=4 && num>=1 && cap >=1 && space==0 && Fnum==0)
        {
            System.out.print("Password is Valid");
        }
        else{
            System.out.print("Password is Invalid");
        }
        obj.close();
    }
}
