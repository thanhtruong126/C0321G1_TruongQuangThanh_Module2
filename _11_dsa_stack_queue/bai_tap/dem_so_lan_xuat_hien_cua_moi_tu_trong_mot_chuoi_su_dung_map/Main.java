package bai11_DSA_stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra: ");
        String string = sc.nextLine();
        String[] stringSplit = string.split("");

        Map<String, Integer> map = new HashMap<>();

        for (String c : stringSplit) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
