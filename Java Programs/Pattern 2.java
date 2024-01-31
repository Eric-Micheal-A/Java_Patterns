//write your code here
import java.util.*;
class Main
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int i,j,n;
      n=d.nextInt();
      for(i=n;i>=1;i--)
        {
          for(j=1;j<=i;j++)
            {
              System.out.print(i+" ");
            }
          System.out.println();
        }
    }
  }