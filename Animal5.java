class Animal5{
Animal5(){System.out.println("animal is created");}
}
class Dog extends Animal5{
Dog(){
super();
System.out.println("dog is created");
}
}
class TestSuper2{
public static void main(String args[]){
Dog d=new Dog();
}
}