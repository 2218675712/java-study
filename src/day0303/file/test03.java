/*
 * 时间:       2020年3月3日20:01:48
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *      列出下一级
 *      list() 列出下级名称
 *      listFiles() 列出下级对象
 *
 *       ----------------------------------
 * */
package day0303.file;

import java.io.File;

public class test03 {
    public static void main(String[] args) {
//        通过常量指定文件路径
        String path = "D:/学习/JAVA学习/课上代码/src/day0303";
        File dir = new File(path);
//        list() 列出下级名称     是个数组,遍历数组
        String[] subNames = dir.list();
        for (String s : subNames) {
            System.out.println(s);
        }
//        listFiles() 列出下级对象
        File[] subFiles = dir.listFiles();
        for (File s : subFiles) {
            System.out.println(s.getAbsolutePath());
        }
//        所有盘符
        File[] roots = dir.listRoots();
        for (File r : roots) {
            System.out.println(r.getAbsolutePath());
        }
    }
}
