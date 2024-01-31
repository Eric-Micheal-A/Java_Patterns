//write your code here
import java.util.*;
class Pattern2
{
  public static void main(String args[])
  {
    Scanner d=new Scanner(System.in);
    int n,i,j;
    n=d.nextInt();
    for(i=n;i>=1;i--)
      {
        for(j=n;j>=i;j--)
          {
            System.out.print(j);
          }
        System.out.println();
      }
  }
}