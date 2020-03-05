/*
 * 时间:       2020年3月5日15:57:59
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *          文件拷贝：文件字节输入、输出流
 *       ----------------------------------
 * */
package day0304.io;


import java.io.*;

public class test04 {
    public static void main(String[] args) {
        copy("src/day0303/img/壁纸.jpg", "src/day0304/io/壁纸.jpg");
    }

    public static void copy(String srcPath, String destPath) {
//    1.创建源
        File src = new File(srcPath);//源头
        File dest = new File(destPath);//目的地
//    2.选择流
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
//        3.操作
            byte[] flush = new byte[1024];//缓冲容器
            int len = -1;
            while ((len = is.read(flush)) != -1) {
//                因为图片是二进制的,不需要加码和解码
                os.write(flush, 0, len);//分段写出
            }
            os.flush();//强制刷新缓存区
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            4.释放资源,先打开的后关闭
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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

