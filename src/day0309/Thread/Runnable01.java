package day0309.Thread;

public class Runnable01 {
    public static class MyRunnable01 implements Runnable {
        //        共享数据情况,由于系统中断,会导致数据出错
//        解决办法:在run方法前加上synchronized关键字即可得到正确答案。
        public int count = 20;

        @Override
        public void run() {
            show();
        }

        public synchronized void show() {
            while (count > 0) {
                try {
                    count--;
                    System.out.println(count);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("正在执行线程:" + Thread.currentThread());
                }
            }
//
        }

    }
}
