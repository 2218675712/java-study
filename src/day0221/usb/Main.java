package day0221.usb;

import day0221.usb.impl.UDisk;

public class Main {
    public static void main(String[] args) {
        Usb usb = new UDisk();
        usb.service();
    }

}
