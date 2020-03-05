/*
 * 时间:       2020年3月5日21:44:33
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *        字节数组输出流 ByteArrayOutputStream
 *          1、创建源  : 内部维护
 *          2、选择流  : 不关联源
 *          3、操作(写出内容)
 *          4、释放资源 :可以不用
 *
 *          获取数据:  toByteArray()
 *       ----------------------------------
 * */
package day0304.io;


import java.io.*;

public class test09 {
    public static void main(String[] args) {
//        1.创建源
        byte[] dest = null;
//        2.选择流(新增方法)
        ByteArrayOutputStream baos=null;
        try {
            baos = new ByteArrayOutputStream();
//            3.操作(写出)
            String msg = "show me the code";
            byte[] datas = msg.getBytes();
            baos.write(datas, 0, datas.length);
            baos.flush();
            //获取数据
            dest=baos.toByteArray();
            System.out.println(dest.length+"---"+new String(dest,0,dest.length));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != baos) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
