/*
 * 时间:       2020年3月8日12:10:45
 * 目的:       学习java.io
 * 结果:
 *       ----------------------------------
 *          字符复制缓冲流
 *       ----------------------------------
 * */
package day0306.io;

import java.io.*;

public class test07 {
    public static void main(String[] args) {
        copy("src/day0306/io/abc.txt", "src/day0306/io/abc1.txt");
    }

    public static void copy(String srcPath, String destPath) {
        //1、创建源
        File src = new File(srcPath); //源头
        File dest = new File(destPath);//目的地
        try (BufferedReader br = new BufferedReader(new FileReader(src));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dest));) {
            String line = null;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

