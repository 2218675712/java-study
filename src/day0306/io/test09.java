package day0306.io;

import java.io.*;
import java.net.URL;

public class test09 {
    public static void main(String[] args) {
        try(BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(
                                    new URL("http://www.baidu.com").openStream(),"UTF-8"));
            BufferedWriter writer =
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("baidu.html"),"UTF-8"));){
            //3、操作 (读取)
            String msg ;
            while((msg=reader.readLine())!=null) {
                //System.out.println(msg);
                writer.write(msg); //字符集不统一不够出现乱码
                writer.newLine();
            }
            writer.flush();
        }catch(IOException e) {
            System.out.println("操作异常");
        }


    }
}
