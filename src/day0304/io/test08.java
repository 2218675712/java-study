/*
 * 时间:       2020年3月5日21:36:10
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *          四个步骤:字节数组输入流
 *          1、创建源  : 字节数组 不要太大
 *          2、选择流
 *          3、操作
 *          4、释放资源: 可以不用处理
 *       ----------------------------------
 * */
package day0304.io;

import java.io.*;

public class test08 {
    public static void main(String[] args) {
//        1.创建流
        byte[] src ="talk is cheap show me the code".getBytes();
        InputStream is = null;
        try {
            is = new ByteArrayInputStream(src);
            byte[] flush = new byte[5];
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
