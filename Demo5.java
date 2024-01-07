import java.util.Scanner;
class Demo5{ 
public int calculateFactorial(int n){
if(n==0) return 1;
else
return n*calculateFactorial(n-1);
}
}
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Demo5 d=new Demo5();
System.out.println(d.calculateFactorial(p));
}
}