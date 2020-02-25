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
        } catch (Exception e) {
            e.printStackTrace();
//            无论异常都会执行
        } finally {
            System.out.println("程序执行结束");
        }
    }
}
