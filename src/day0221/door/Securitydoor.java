package day0221.door;

public class Securitydoor extends Door implements Lock,MenLing {
    public void open() {
        System.out.println("开门");
    }

    public void close() {
        System.out.println("关门");
    }

    @Override
    public void lockUp() {
        System.out.println("上锁");
    }

    @Override
    public void openLock() {
        System.out.println("关锁");
    }

    @Override
    public void Bell() {
        System.out.println("正在响铃");
    }
}
