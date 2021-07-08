import java.util.*;
class Singlenumber
{
public static void main(String args[ ])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array : ");
int n=sc.nextInt();
int a[ ]=new int[n];
System.out.println("Enter elements in array : ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(int i=0;i<n;i++)
{
int count=0;
for(int j=0;j<n;j++)
{
if(a[i]==a[j])
{
count++;
}
}
if(count==1)
System.out.print(a[i]+" ");
}
}
}