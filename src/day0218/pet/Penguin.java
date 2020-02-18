package day0218.pet;

public class Penguin extends Pet {
    //    品种
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
//抽象
    public void print() {
        System.out.println("我的名字是" + super.getName() + "我的健康值是" + super.getHealth() + "我的亲密度是" + super.getLove()+this.getSex());
    }
}
