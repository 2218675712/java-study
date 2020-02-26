/*
 * 时间:       2020年2月26日15:20:58
 * 目的:       学习链表集合
 * 结果:
 *       ----------------------------------
 *
 *
 *       ----------------------------------
 * */
package day0226;

import java.util.LinkedList;

public class LinkedList_Study {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("小明");
        list.add("小白");
        list.add("小灰");
        list.add("小王");
        list.remove("小白");
        System.out.println(list.contains("小白") ? "找到小白了" : "小白丢了");
//        在列表的首部添加元素
        list.addFirst("我是首部");
        //        在列表的末尾添加元素
        list.addLast("我是末尾");
//        返回列表中的第一个元素
        System.out.println(list.getFirst());
        //        返回列表中的最后一个元素
        System.out.println(list.getLast());
//删除并返回列表第一个元素
        list.removeFirst();
        //删除并返回列表最后一个元素
        list.removeLast();
    }
}
