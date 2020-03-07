/*
 * 时间:       2020年3月7日22:51:00
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *       ----------------------------------
 * */
package day0306.io;


import java.io.*;

public class test03 {
    public static void main(String[] args) {
        File src = new File("src/day0304/io/abc.txt");
        OutputStream os = null;
        try {
            os =new BufferedOutputStream( new FileOutputStream(src, true));
            String msg = "hello world";
            byte[] datas = msg.getBytes();
            os.write(datas, 0, datas.length);
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
