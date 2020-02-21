package day0221.door;

public class Main {
    public static void main(String[] args) {
//        new个防盗门
        Securitydoor securitydoor = new Securitydoor();
        securitydoor.close();
        securitydoor.lockUp();
        securitydoor.Bell();
        securitydoor.openLock();
        securitydoor.open();
    }
}
