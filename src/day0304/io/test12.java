/*
 * 时间:       2020年3月8日21:11:20
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *          数据流
 *       ----------------------------------
 * */
package day0304.io;

import java.io.*;

public class test12 {
    public static void main(String[] args) {
        //写出
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));
        //操作数据类型 +数据
        try {
            dos.writeUTF("编码辛酸泪");
            dos.writeInt(18);
            dos.writeChar('a');
            dos.writeBoolean(false);
            dos.flush();
            byte[] datas = baos.toByteArray();
            System.out.println(datas.length);
//            读取
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
            //顺序与写出一致
            String msg = dis.readUTF();
            int age = dis.readInt();
            boolean flag = dis.readBoolean();
            char ch = dis.readChar();
            System.out.println(flag);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
