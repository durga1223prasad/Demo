import java.util.Scanner;
class Demo2{
public void displayMenu(){
System.out.println("+:Addition:");
System.out.println("-:Subraction\n*:Multiplication");
System.out.println("/:Divison:");
}
public void add(int a,int b)
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}
public int sub(int a,int b)
{
int res=a-b;
return res;
}
}
class Test{
public static void main(String args[]){
Demo2 ob=new Demo2();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
ob.add(n1,n2);
int r=ob.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
}
}