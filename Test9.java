import java.io.*;
import java.util.*;
class Test9{
static public void main(String[] args){
Scanner sc=new Scanner(System.in)
int inpVar=sc.nextInt();
System.out.println(Test.printDay(inpVar));
}
public static String printDay(int dayno){
String day;
switch(dayno){
case0:{day="SUNDAY";break;}
case1:{day="MONDAY";break;}
case2:{day="TUESDAY";break;}
case3:{day="WEDNESDAY";break;}
case4:{day="THURSDAY";break;}
case5:{day="FRIDAY";break;}
case6:{day="SATURDAY";break;}
default:day="INVALID";
}
return day;
}
}