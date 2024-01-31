import java.util.*;
class Pattern
  {
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int i,j,n;
      n=d.nextInt();
      for(i=1;i<=n;i++)
        {
          for(j=1;j<=i;j++)
            {
              System.out.print(j);
            }
          System.out.println();
        }
    }
  }