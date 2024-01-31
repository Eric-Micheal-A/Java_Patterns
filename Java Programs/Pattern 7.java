//write your code here
import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,i,j;
      n=d.nextInt();
      for(i=1;i<=n;i++)
        {
          for(j=i;j>=1;j--)
            {
              System.out.print(j);
            }
          System.out.println();
        }
    }
  }