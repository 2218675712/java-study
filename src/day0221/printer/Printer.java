package day0221.printer;
//定义打印机类
public class Printer implements InkBox,Paper {

    @Override
    public void inkCartridge() {
        System.out.println("正在供墨,请稍等...");
    }

    @Override
    public void paperr() {
        System.out.println("正在打印");
    }
}
