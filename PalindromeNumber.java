import  java.util.Scanner;
class PalindromeNumber
 {
  public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int num=s.nextInt();
int reversedNum=0,remainder;
int originalNum = num;
while (num != 0) {
remainder = num % 10;
reversedNum = reversedNum * 10 + remainder;
num /= 10;
}
if (originalNum == reversedNum) {
System.out.println(originalNum + " is Palindrome.");
}
else 
{
System.out.println(originalNum + " is not Palindrome.");
}
}
}