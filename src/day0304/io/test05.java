/*
 * 时间:       2020年3月5日17:07:23
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *          四个步骤: 分段读取 文件字符输入流
 *              创建源
 *              选择流
 *              操作
 *              释放资源
 *       ----------------------------------
 * */
package day0304.io;


import java.io.*;


public class test05 {
    public static void main(String[] args) {

        File src = new File("src/day0304/io/abc.txt");
        Reader reader = null;
        try {
            reader = new FileReader(src);
//            操作:分段读取
            char[] flush = new char[1024];
            int len = -1;
            while ((len = reader.read(flush)) != -1) {
//                字符数组--字符串
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
