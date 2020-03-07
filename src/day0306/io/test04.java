/*
 * 时间:       2020年3月7日22:51:35
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *      复制代码,加上缓冲流好处,提升性能
 *       ----------------------------------
 * */
package day0306.io;

import java.io.*;

public class test04 {
    public static void copy(String srcPath,String destPath) {
        //1、创建源
        File src = new File(srcPath); //源头
        File dest = new File(destPath);//目的地
        //2、选择流
        try(InputStream is=new BufferedInputStream(new FileInputStream(src));
            OutputStream os =new BufferedOutputStream( new FileOutputStream(dest));	) {
            //3、操作 (分段读取)
            byte[] flush = new byte[1024]; //缓冲容器
            int len = -1; //接收长度
            while((len=is.read(flush))!=-1) {
                os.write(flush,0,len); //分段写出
            }
            os.flush();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
