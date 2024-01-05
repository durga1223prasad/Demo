import java.util.Scanner;
class Loop6r{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=n;i>=0;i=i-5)System.out.print(i+",");
int i=n;
while(i>=0){
System.out.print(i+",");
i=i-5;
}
}
}