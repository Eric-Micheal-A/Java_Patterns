//write your code here
import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,i,j,k;
      n=d.nextInt();
      for(i=n;i>=1;i--)
      {
          for(k=i-1;k>=1;k--)
          {
              System.out.print(" ");
          }
          for(j=i;j<=n;j++)
          {
              System.out.print(j);
          }
          System.out.println();
      }
    }
  }