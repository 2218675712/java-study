/*
 * 时间:       2020年3月5日17:20:19
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *        文件字符输出流
 *          1、创建源
 *          2、选择流
 *          3、操作(写出内容)
 *          4、释放资源
 *       ----------------------------------
 * */
package day0304.io;


import java.io.*;

public class test06 {
    public static void main(String[] args) {
        File src = new File("src/day0304/io/abc.txt");
        Writer writer = null;
        try {
            writer = new FileWriter(src);
//            写法一
            /*String msg = "hello world \n 世界如此美好";
            char[] datas = msg.toCharArray();
            writer.write(datas, 0, datas.length);
            writer.flush()*/

//            写法二
/*            String msg = "hello world \n 世界如此美好";
            writer.write(msg);
//            这个是追加
            writer.write("123");
            writer.flush();*/
//          写法三
            writer.append("hello world \n 世界如此美好").append("123");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
