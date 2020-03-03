/*
 * 时间:       2020年3月3日20:02:00
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *      学习创建目录
 *      mkdir() 确保上级目录存在,才创建
 *      mkdirs()上级目录不存在,则连同上级目录一起创建
 *
 *       ----------------------------------
 * */
package day0303.file;

import java.io.File;
import java.io.IOException;

public class test02 {
    public static void main(String[] args) {
        boolean flag;
//        通过常量指定文件路径
        String path = "src/day0303/file/dir/test01/test01.txt";
        File src = new File(path);
//        创建一个文件夹
//        失败
//        flag = src.mkdir();
//        成功
        flag = src.mkdirs();
        System.out.println(flag);
    }
}
