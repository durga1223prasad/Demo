import java.util.Scanner;
class Alpha{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character:");
char input=sc.next().charAt(0);
if(Character.isLetter(input)){
System.out.println(input+"is an alphabet");
}
else
{
System.out.println(input+"is not an aplhabet");
}
sc.close();
}
}