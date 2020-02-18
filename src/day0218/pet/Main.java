package day0218.pet;

public class Main {
    public static void main(String[] args) {
//        多态
        Pet dog1 = new Dog();
//        向下转型
        Dog dog = (Dog) dog1;
        dog.setName("二哈");
        dog.setHealth(100);
        dog.setLove(0);
        dog.setStrain("哈士奇");
        dog.print();

    }
}
