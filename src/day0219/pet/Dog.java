package day0219.pet;

public class Dog extends Pet {

    //    品种
    private String strain;
    //    变成常量
    public static final int ID = 1;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void print() {
        System.out.println("我的名字是" + super.getName() + "我的健康值是" + super.getHealth() + "我的亲密度是" + super.getLove());
    }
}
