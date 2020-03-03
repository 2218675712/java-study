/*
 * 时间:       2020年3月3日20:23:10
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *      打印打印子孙级目录和文件的名称
 *       ----------------------------------
 * */
package day0303.file;

import java.io.File;

public class test04 {
    public static void main(String[] args) {
        File src = new File("D:/学习/JAVA学习/课上代码/src");
        printName(src, 0);
    }

    public static void printName(File src, int deep) {
//        控制前面的层次
        for (int i = 0; i < deep; i++) {
            System.out.print("-");
        }
//        打印名称
        System.out.println(src.getName());
        if (null == src || !src.exists()) {//递归头
            return;
        } else if (src.isDirectory()) {//目录
            for (File s : src.listFiles()) {
                printName(s, deep + 1);
            }
        }
    }
}
