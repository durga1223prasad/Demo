import java.util.Scanner;
class unarynot1{
public static void main(String[] args){
boolean cond=true;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Condis:"+cond);
System.out.println("Var1"+a);
System.out.println("Var2"+b);
System.out.println("Now Condis:"+!cond);
System.out.println("!(a<b)="+!(a<b));
System.out.println("!(a>b)="+!(a<b));
}
}