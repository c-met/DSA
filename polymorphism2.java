public class polymorphism2 {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
        
    }
}
class Animal{
    void eat(){
        System.err.println("eats anything");
    } 
}
class Deer extends Animal {
    void eat(){
        System.err.println("eats grass");
    }
}
