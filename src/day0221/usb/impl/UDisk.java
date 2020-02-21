package day0221.usb.impl;

import day0221.usb.Usb;

public class UDisk implements Usb {
    //    实现U盘接口
    @Override
    public void service() {
        System.out.println("连接USb传输数据");

    }
}
