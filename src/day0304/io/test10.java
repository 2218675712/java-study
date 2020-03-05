/*
 * 时间:       2020年3月5日22:19:17
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *          1、 图片读取到字节数组
 *          2、 字节数组写出到文件
 *       ----------------------------------
 * */
package day0304.io;

import java.io.*;

public class test10 {
    public static void main(String[] args) {
        byte[] datas = fileToByteArray("src/day0303/img/壁纸.jpg");
        byteArrayToFile(datas, "src/day0304/io/壁纸.jpg");
    }

    /**
     * 1、图片读取到字节数组
     * 1)、图片到程序  FileInputStream
     * 2)、程序到字节数组	ByteArrayOutputStream
     */
    public static byte[] fileToByteArray(String filePath) {
//     创建源与目的地
//        1.创建流
        File src = new File(filePath);
        byte[] dest = null;
//        2.选择流
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            is = new FileInputStream(src);
            baos = new ByteArrayOutputStream();
//            3.操作
            byte[] flush = new byte[1024 * 10];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                baos.write(flush, 0, len);
            }
            baos.flush();
            return baos.toByteArray();
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
        return null;
    }

    /*
     * 2、字节数组写出到图片
     * 1)、字节数组到程序 ByteArrayInputStream
     * 2)、程序到文件 FileOutputStream
     */
    public static void byteArrayToFile(byte[] src, String filePath) {
//        1.创建流
        File dest = new File(filePath);
//        选择流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new ByteArrayInputStream(src);
            os = new FileOutputStream(dest);
            byte[] flush = new byte[1024 * 10];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
