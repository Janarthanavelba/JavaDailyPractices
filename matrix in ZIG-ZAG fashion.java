/*Given a matrix of 2D array of n rows and m coloumns. Print this matrix in ZIG-ZAG fashion as shown in figure.
 
Example:
Input: 
1 2 3
4 5 6
7 8 9
Output: 
1 2 4 7 5 3 6 8 9*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt();
        int n2=obj.nextInt();
        int [][]arr=new int[n1][n2];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
               System.out.print(arr[j][i]+" ");
            }
        }
        
    }
}
