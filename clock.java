import java.util.*;
class clock
{
     public static void main(String[]args) 
     {
         Scanner obj=new Scanner (System.in);
         int x=obj.nextInt(),y=obj.nextInt();
         if(x*y>24) System.out.print(-1);
         else if(x*y>12) System.out.print(x*y-12);
         else System.out.print(x*y);
     }
}
