import java.util.Scanner;
class Demo1{
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
}
class Test{
public static void main(String args[]){
Demo1 ob=new Demo1();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
ob.add(n1,n2);
}
}
