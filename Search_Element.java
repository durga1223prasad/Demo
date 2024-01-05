import java.util.Scanner;
class Search_Element{
public static void main(String[] args){
int n, x, flag=0, i=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter no.of elememts ypu want in array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter all the elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
System.out.print("Enter the element you want to find:");
x=sc.nextInt();
{
if(a[i]==x){flag=1; break;}
if(flag==1)
{
System.out.println("Enter found at position:"+(i+1));
}
else
System.out.println("Element not found");
}
}
}
}