class Animal4{
String color="white";
}
class Dog extends Animal4{
String color="black";
void printColor(){
System.out.println(color);
System.out.println(super.color);
}
}
class TestSuper1{
public static void main(String args[]){
Dog d=new Dog();
d.printColor();
}
}c