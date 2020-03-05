/*
 * 时间:       2020年3月5日18:10:53
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *        文件字符输出流
 *          拷贝
 *       ----------------------------------
 * */
package day0304.io;

import java.io.*;

public class test07 {
    public static void main(String[] args) {
    myCopy("src/day0304/io/abc.txt","src/day0304/io/abc1.txt");
    }

    public static void myCopy(String read,String write) {
        File readPath = new File(read);
        File writePath = new File(write);
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(readPath);
            writer = new FileWriter(writePath);
//            操作:分段读取
            char[] flush = new char[1024];
            int len = -1;
            while ((len = reader.read(flush)) != -1) {
//                字符数组--字符串
               writer.write(flush,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != reader) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
