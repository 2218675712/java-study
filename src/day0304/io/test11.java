/*
 * 时间:       2020年3月6日21:02:17
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *          封装复制类
 *       ----------------------------------
 * */
package day0304.io;

import java.io.*;

public class test11 {
    public static void main(String[] args) {
//        1.文件到文件
/*
        try {
            InputStream is = new FileInputStream("src/day0304/io/abc.txt");
            OutputStream os = new FileOutputStream("src/day0304/io/abc1.txt");
            copy(is,os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        */
//        2.文件到字节数组

        byte[] datas = null;
        try {
            InputStream is = new FileInputStream("src/day0303/img/壁纸.jpg");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            copy(is, baos);
            datas = baos.toByteArray();
            System.out.println(datas.length);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        close();

//        3.字节数组转文件
        try {
            InputStream is = new ByteArrayInputStream(datas);
            OutputStream os = new FileOutputStream("src/day0304/io/壁纸.jpg");
            copy(is, os);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        close();
    }

    /**
     * 对接输出输出流
     * try-with-resources
     *
     * @param is
     * @param os
     */
    public static void copy(InputStream is, OutputStream os) {
//        jdk7执行完毕释放资源
        try (is; os) {
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 释放资源
     *
     * @param ios
     */
    public static void close(Cloneable... ios) {
        for (Cloneable io : ios) {
            if (null != io) {
                ios.clone();
            }
        }
    }
}
