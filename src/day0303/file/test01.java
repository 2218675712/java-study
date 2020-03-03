/*
 * 时间:       2020年3月3日16:36:18
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *      学习new文件对象
 * 基本信息
 *      名称 getName()        路径 getPath()    绝对路径 getAbsolutePath()
 *      上级路径 getParent()    父对象 getParentFile().getName()
 * 文件状态
 *      是否存在 exists()       是否文件 isFile()      是否文件夹 isDirectory()
 * 其他信息
 *      文件字节数 length()      创建文件createNewFile()     删除文件delete()
 *       ----------------------------------
 * */
package day0303.file;

import java.io.File;
import java.io.IOException;

public class test01 {
    public static void main(String[] args) throws IOException {
        boolean flag;
//        通过常量指定文件路径
        String path = "src/day0303/img/壁纸.jpg";
//        创建一个文件对象
        File src = new File(path);


//         基本信息
        System.out.println("名称:" + src.getName());
        System.out.println("路径:" + src.getPath());
        System.out.println("绝对路径:" + src.getAbsolutePath());
        System.out.println("父路径:" + src.getParent());
        System.out.println("父对象:" + src.getParentFile().getName());
//        文件状态
        System.out.println("是否存在" + src.exists());
        System.out.println("是否文件" + src.isFile());
        System.out.println("是否文件夹" + src.isDirectory());
//        常用操作
        if (!src.exists()) {
            System.out.println("文件不存在");
        } else {
            if (src.isFile()) {
                System.out.println("文件操作");
            } else {
                System.out.println("文件夹操作");
            }
        }
//        其他信息
        System.out.println("文件的字节数" + src.length());
        src = new File("src/day0303/file/test01.txt");
//        上面会出现throws IOException是因为可能创建失败 flag为创建状态
        flag = src.createNewFile();
        System.out.println("创建状态" + flag);
//        删除文件
        flag = src.delete();
        System.out.println("删除状态" + flag);
    }
}
