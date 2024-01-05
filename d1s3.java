class d1s3{
public static int add(int a,int b){
return a+b;
}
}
public static void main(String args[]){

int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[1]);
int res=d1s3.add(n1,n2);
System.out.println(res);
}