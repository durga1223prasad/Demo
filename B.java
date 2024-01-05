class B
{
public static void main(){
System.out.println("Main method without argument called.");
}
public static void main(int x){
System.out.println("Main method with argument called"+x*2);
}
public static void main(String s){System.out.println("Welcome"+s);}
public static void main(String args[]){
System.out.println("Dhruva is typing");
main();
main("durgaprasad");
main(20);
}

}