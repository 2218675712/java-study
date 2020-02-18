package day0218.pet;

//继承
public abstract class Pet {
    private String name;
    private int health;
    private int love;


    public Pet() {

    }

    public Pet(String name, int health, int love) {
        this.name = name;
        this.health = health;
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 0) {
            this.health = health;
        } else {
            System.out.println("健康值不正确");
        }
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
    abstract public void print();
}
