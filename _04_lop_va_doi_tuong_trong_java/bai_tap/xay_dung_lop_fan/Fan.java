package bai4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Fan {
    // Thuộc tính
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    // Khởi tạo phương thức không tham số đối tượng Fan mặc định
    public Fan() {

    }
    // Tạo getter và setter cho các thuộc tính
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public boolean getOn() {
        return this.on;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    // Phương thức toString() trả về chuỗi thông tin của quạt
    public String toString() {
        if (this.on) {
            return "Fan is on: " + "speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius;
        } else {
            return "Fan is off: " + "color: " + this.color + ", radius: " + this.radius;
        }
    }
}
