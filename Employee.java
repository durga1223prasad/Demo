import java.util.Scanner;
import java.util.Arrays;
class Employee{
private int eid;
private String ename;
private String edept;
public void setEid(int eid){this.eid=eid;}
public void setEname(String ename){this.ename=ename;}
public void setEdept(String edept){this.edept=edept;}
public int getEid(){return this.eid;}
public String getEname(){return this.ename;}
public String getEdept(){return this.edept;}
}
class Day4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Employee[] ob=new Employee[5];
for(int i=0;i<5;i++){
ob[i]=new Employee();
ob[i].setEid(sc.nextInt());
ob[i].setEname(sc.next());
ob[i].setEdept(sc.next());
}System.out.println("Details are:");
for(int j=0;j<5;j++){
System.out.println("EID:"+ob[j].getEid());
System.out.println("ENAME:"+ob[j].getEname());
System.out.println("EDEPT:"+ob[j].getEdept());
}
}
}