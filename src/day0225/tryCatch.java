/*
 * 时间:       2020年2月25日13:55:09
 * 目的:       学习异常处理
 * 结果:
 *       ----------------------------------
 *
 *
 *       ----------------------------------
 * */
package day0225;

public class tryCatch {
    public static void main(String[] args) {

//        可能程序在接下来的代码会出现异常
        try {
            double value = 3 / 0;
//            异常匹配尽量先子类在父类
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("数组越界");
            e.printStackTrace();
//            无论异常都会执行
        } catch (ArithmeticException e) {
            System.err.println("算术错误");
            e.printStackTrace();
        } finally {
//            唯一不执行的时候      跳出Java虚拟机system.exit(int status)
            System.out.println("程序执行结束");
        }

        //可以使用log4j将日志文件保存到文件
    }
}
