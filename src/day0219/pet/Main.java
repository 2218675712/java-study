package day0219.pet;

public class Main {
    public static void main(String[] args) {
//        多态
        Pet pet = new Dog();
//        向下转型
        Dog dog = (Dog) pet;
        dog.setName("二哈");
        dog.setHealth(100);
        dog.setLove(0);
        dog.setStrain("哈士奇");
        dog.print();

    }
}
