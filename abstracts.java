public class abstracts {
    public static void main(String[] args) {
       Horse h = new Horse();
       h.eat();
       h.walk();
       
       Chicken c = new Chicken();
       c.eat();
       c.walk();
System.out.println(h.color);


Mustang myHorse = new Mustang();
//animal-> Horse->Mustang
    }
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal construcror called");
       // color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse() {
        System.out.println("horse constructor called");
    }
    void changeColor(){
       color = "dark brown";
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("constructor called");
    }
}

class Chicken extends Animal{
    void changeColor(){
       color = "yellow";
    }
    void walk(){
        System.out.println("walks on two legs");
    }
}