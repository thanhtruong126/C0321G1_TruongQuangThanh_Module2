package bai4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng fan 1 và fan 2
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        // Thiết lập thuộc tính fan 1 và fan 2
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        // In ra fan 1 và fan 2
        System.out.println("Fan 1: "+fan1.toString());
        System.out.println("Fan 2: "+fan2.toString());
    }
}
