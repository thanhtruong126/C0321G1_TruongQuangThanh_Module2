package bai2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int nhapSo=-1;
        while (nhapSo!=5){
            System.out.println("1: in hinh chu nhat");
            System.out.println("2: in hinh tam giac vuong goc tren ben trai");
            System.out.println("3: in hinh tam giac vuong goc duoi ben trai");
            System.out.println("4: thoat");
            System.out.println("Nhap lua chon: ");
            nhapSo = scanner.nextInt();

            switch (nhapSo){
                case 1:
                    String hinhChuNhat="";
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 8; j++) {
                            hinhChuNhat+="*";
                        }
                        hinhChuNhat+="\n";
                    }
                    System.out.println(hinhChuNhat);
                    break;
                case 2:
                    String hinhTamGiacVuong1="";
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5-i; j++) {
                            hinhTamGiacVuong1+="*";
                        }
                        hinhTamGiacVuong1+="\n";
                    }
                    System.out.println(hinhTamGiacVuong1);
                    break;
                case 3:
                    String hinhTamGiacVuong2="";
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i+1; j++) {
                            hinhTamGiacVuong2+="*";
                        }
                        hinhTamGiacVuong2+="\n";
                    }
                    System.out.println(hinhTamGiacVuong2);
                    break;
                case 4:
                    System.exit(5);
                default:
                    break;
            }
        }
    }
}
