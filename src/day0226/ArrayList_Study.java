/*
 * 时间:       2020年2月26日15:19:45
 * 目的:       ArrayList学习
 * 结果:
 *       ----------------------------------
 *
 *
 *       ----------------------------------
 * */
package day0226;

import java.util.ArrayList;

public class ArrayList_Study {
    public static void main(String[] args) {
//        创建一个ArrayList集合
        ArrayList list = new ArrayList();
//        向list集合添加数据
        list.add("小明");
        list.add("小红");
        list.add("小灰");
        list.add("小蓝");
//        向list集合删除数据
        list.remove(2);
//        判断list有没有这个数据
        System.out.println(list.contains("小灰") ? "小灰在里面" : "小灰丢了");
//        遍历list集合
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
