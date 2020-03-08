/*
 * 时间:       2020年3月8日12:56:26
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *        转换流: InputStreamReader OutputStreamWriter
 *          1、以字符流的形式操作字节流（纯文本的）
 *          2、指定字符集
 *       ----------------------------------
 * */
package day0306.io;

import java.io.*;

public class test08 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));) {
//            循环获取键盘的输入
            String msg = "";
            while (!msg.equals("exit")) {
                msg = reader.readLine();//循环读入
                writer.write(msg);//循环写出
                writer.newLine();
                writer.flush();//强制刷新
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
