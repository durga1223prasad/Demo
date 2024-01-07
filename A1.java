class A{
void eat(){
System.out.println("starving....");
}
}//A
class Animal extends A{
void eat(){System.out.println("eating......");}
}//Animal
class Dog extends Animal{
void eat(){System.out.println("eating bread....");}
void bark(){System.out.println("bark....");}
void work(){
super.eat();
bark();
}//bark()
}//Dog
class Test{
public static void main(String args[]){
Dog d=new Dog();
d.work();
}
}