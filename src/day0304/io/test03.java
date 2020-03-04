/*
 * 时间:       2020年3月4日22:55:01
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *      分段读取 文件字节输入流    输出流
 *              1、创建源
 *              2、选择流
 *              3、操作
 *              4、释放资源
 *       ----------------------------------
 * */
package day0304.io;


import java.io.*;

public class test03 {
    public static void main(String[] args) {
/*//        1.创建源
        File src = new File("src/day0304/io/abc.txt");
//        2.选择流
        OutputStream os = null;
        try {
//            在后面加上true则为追加
            os = new FileOutputStream(src,true);
//            3.操作(写出)
            String msg = "ni hao shi jie";
            byte[] datas = msg.getBytes();// 字符串-->字节数组(编码)
            os.write(datas, 0, datas.length);//写入数据
            os.flush();//清空缓存区
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
        }*/
        File src = new File("src/day0304/io/abc.txt");
        OutputStream os = null;
        try {
            os = new FileOutputStream(src, true);
            String msg = "hello world";
            byte[] datas = msg.getBytes();
            os.write(datas, 0, datas.length);
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
