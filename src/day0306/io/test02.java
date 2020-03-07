/*
 * 时间:       2020年3月7日22:13:24
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *          加入缓冲流
 *       ----------------------------------
 * */
package day0306.io;


import java.io.*;


public class test02 {
    public static void main(String[] args) {
//        1.创建流
        File src = new File("src/day0304/io/abc.txt");
        InputStream is = null;
        try {
            is = new BufferedInputStream(new FileInputStream(src));
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、释放资源
            try {
                if (null != is) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
