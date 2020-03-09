package day0309.Thread;

/*
* 4.1 currentThread()
返回对当前正在执行的线程对象的引用。
4.2 getId()
返回此线程的标识符
4.3 getName()
返回此线程的名称
4.4 getPriority()
返回此线程的优先级
4.5 isAlive()
测试这个线程是否还处于活动状态。
什么是活动状态呢？
活动状态就是线程已经启动且尚未终止。线程处于正在运行或准备运行的状态。
4.6 sleep(long millis)
使当前正在执行的线程以指定的毫秒数“休眠”（暂时停止执行），具体取决于系统定时器和调度程序的精度和准确性。
4.7 interrupt()
中断这个线程。
4.8 interrupted() 和isInterrupted()
interrupted()：测试当前线程是否已经是中断状态，执行后具有将状态标志清除为false的功能
isInterrupted()： 测试线程Thread对相关是否已经是中断状态，但部清楚状态标志
4.9 setName(String name)
将此线程的名称更改为等于参数 name 。
4.10 isDaemon()
测试这个线程是否是守护线程。
4.11 setDaemon(boolean on)
将此线程标记为 daemon线程或用户线程。
4.12 join()
在很多情况下，主线程生成并起动了子线程，如果子线程里要进行大量的耗时的运算，主线程往往将于子线程之前结束，但是如果主线程处理完其他的事务后，需要用到子线程的处理结果，也就是主线程需要等待子线程执行完成之后再结束，这个时候就要用到join()方法了。
join()的作用是：“等待该线程终止”，这里需要理解的就是该线程是指的主线程等待子线程的终止。也就是在子线程调用了join()方法后面的代码，只有等到子线程结束了才能执行
4.13 yield()
yield()方法的作用是放弃当前的CPU资源，将它让给其他的任务去占用CPU时间。注意：放弃的时间不确定，可能一会就会重新获得CPU时间片。
4.14 setPriority(int newPriority)
更改此线程的优先级*/
public class Main01 {
    public static void main(String[] args) {
//        线程1
        Runnable myRunnable01=new Runnable01.MyRunnable01();
        Thread thread01=new Thread(myRunnable01);
        thread01.setName("线程1");
        thread01.start();
//        线程2
        Runnable myRunnable02=new Runnable01.MyRunnable01();
        Thread thread02=new Thread(myRunnable02);
        thread02.setName("线程2");
        thread02.start();
    }
}
