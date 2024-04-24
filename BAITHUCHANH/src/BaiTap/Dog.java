package BaiTap;

public class Dog extends Animal {
    void run(){
        System.out.println("Dog is fast");
    }
    void eat(){
        System.out.println("Dog eat a lot of");
    }
public static void main(String[] args){
    Animal animal = new Dog();
    animal.run();
    animal.eat();
   }
}