public class Abstraction {
    public static void main(String[] args) {
        cow obj = new cow();
        obj.walk();

    }

}
abstract class Animal{
    Animal(){
        System.out.println("Constructor of class Animal");
    }
    abstract void walk();


}
class  Horse extends  Animal{
    Horse(){
        System.out.println("Constructor of class Horse");
    }

    @Override
    void walk() {
        System.out.println("horse walk on 4 legs");
    }
}
class cow extends Animal{
    cow(){
        System.out.println("Constructor of class Cow");
    }
    @Override
    void walk(){
        System.out.println("cow walk on 4 legs");

    }
}