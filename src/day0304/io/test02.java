/*
 * 时间:       2020年3月4日22:28:13
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *      分段读取 文件字节输入流    输入流
 *              1、创建源
 *              2、选择流
 *              3、操作
 *              4、释放资源
 *       ----------------------------------
 * */
package day0304.io;


import java.io.*;


public class test02 {
    public static void main(String[] args) {
        /*
//        1.创建流
        File src = new File("src/day0304/io/abc.txt");
        InputStream is = null;
        try {
//            2.选择流
            is = new FileInputStream(src);
//            3.操作(分段读入)
            byte[] flush = new byte[1024];//缓冲容器
            int len = -1;//接收长度
            while ((len = is.read(flush)) != -1) {
//                字节数组-字符串 解码
//                bytes - 要解码为字符的字节
//                offset - 要解码的第一个字节的索引
//                length - 要解码的字节数
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            4.释放流
            while (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
//        1.创建流
        File src = new File("src/day0304/io/abc.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(src);
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
