import java.util.*;
class calculatefactorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print("enter size");
int n=s.nextInt();
int A[]= new int[n];
System.out.print("enter elements");
for(int i=0;i<n;i++)
{
A[i]=s.nextInt();
}
calculatefactorial ob1= new calculatefactorial();
int B[]=ob1.calculatefactorial(A);
System.out.print("Factorial is");
for(int i=0; i<n;i++)
{
System.out.print(B[i]+",");
}
}
int[] calculatefactorial(int[]A)
{
int B[]=new int[A.length];
for(int i=0;i<A.length;i++)
{
if (A[i]<=1)
B[i]=1;
else
{
int fact=1;
for(int j=A[i];j>1;j--)
{
fact=fact*j;
}
B[i]=fact;
}
}
return B;
}
}