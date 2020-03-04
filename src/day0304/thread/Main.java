package day0304.thread;

public class Main {
    public static void main(String[] args) {
//        通过继承Thread来创建线程
/*        MyThread myThread01=new MyThread();
        MyThread myThread02=new MyThread();
        MyThread myThread03=new MyThread();
        myThread01.start();
        myThread02.start();
        myThread03.start();*/
//        通过实现 Runnable 接口来创建线程
        MyRunnable myRunnable01 = new MyRunnable();
        MyRunnable myRunnable02 = new MyRunnable();
        MyRunnable myRunnable03 = new MyRunnable();
        Thread t1 = new Thread(myRunnable01);
        Thread t2 = new Thread(myRunnable02);
        Thread t3 = new Thread(myRunnable03);
        t1.start();
        t2.start();
        t3.start();
    }
}
