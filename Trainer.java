import java.util.Scanner;
class Trainer {
private int tid;
private double fee;
private String name, course;
public void setTid(int tid) { this.tid = tid; }
public void setFee(double fee) { this.fee = fee; } 
public void setName(String name) { this.name = name; }
public void setCourse(String course) { this.course = course; }
public int getTid() { return this.tid; }
public double getFee() { return this.fee; } 
public String getName() { return this.name; }
public String getCourse() { return this.course; }
public Trainer(int tid, String name, String course) {
this.tid = tid;
this.name = name;
this.course = course;
}
public Trainer() { this.tid = 0; }
}
class Trainer1 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
Trainer[] t = new Trainer[5];
System.out.println("Enter T - ID, NAME, FEE, and COURSE: "); 
for (int i = 0; i < 5; i++) {
t[i] = new Trainer();
t[i].setTid(sc.nextInt());
t[i].setName(sc.next());
t[i].setFee(sc.nextDouble()); 
t[i].setCourse(sc.nextLine()); 
}
for (int j = 0; j < 5; j++) {
System.out.println("Trainer ID : " + t[j].getTid());
System.out.println("Trainer Name : " + t[j].getName());
System.out.println("Course Fee : " + t[j].getFee()); 
System.out.println("Course Name : " + t[j].getCourse());
}
}
}