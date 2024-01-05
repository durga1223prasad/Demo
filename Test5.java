class Test5{
public static void main(String args[]){
int i=0;
int sum=0;
for(i=0;i<=100;i++)
{System.out.print(i+"+");
sum=sum+i;
i=i+4;
}
System.out.print("\b"+"="+sum);
}
}