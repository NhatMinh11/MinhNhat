package BaiTap;

class Cat implements Animals{
    public void run(){
        System.out.println("Cat is fast");
    }
    public void eat(){
        System.out.println("Cat eat a litle");
    }
    public static void main(String[] args){
        Animals animals = new Cat();
        animals.run();
        animals.eat();
    }
}
