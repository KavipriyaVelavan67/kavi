import java.io.*;
class number1
{
public static void main(String args[])
{
int a = 1 ;
for(int i=1;i<=5;i++)
{
for(int j=5;j>=i;j--)
{
System.out.print(" "+j);
}
System.out.println();
}
for(int k=5;k>=1;k--)
{
for(int l=5;l>=k;l--)
{
System.out.print(" "+l);
}
System.out.println();
}
}
}