/*
 * 时间:       2020年3月4日12:29:38
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *      第一个程序:理解操作步骤
 *              1、创建源
 *              2、选择流
 *              3、操作
 *              4、释放资源
 *       ----------------------------------
 * */
package day0304.io;


import java.io.*;

public class test01 {
    public static void main(String[] args) {
/*        //1.创建流
        File src = new File("src/day0304/io/abc.txt");
        //2.选择流
        InputStream is = null;
        int temp;
        try {
            is = new FileInputStream(src);
//            3.操作
            while ((temp = is.read()) != -1) {
                System.out.println((char) temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            4.释放资源
            if (null != is) {
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
            int temp;
//            2.选择流
            is = new FileInputStream(src);
//            3.操作
            while ((temp = is.read()) != -1) {
                System.out.println((char) temp);
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
        }
    }
}
