public class inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.breathes();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
        

//base class
class Animal{
    String color;

    
    void eat(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("breathes");
    }
}
class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
    String breads;
}



//derived class
// class Fish extends Animal{
//     int fins;
//     void swim() {
//         System.err.println("swims in water");
//     }
// }