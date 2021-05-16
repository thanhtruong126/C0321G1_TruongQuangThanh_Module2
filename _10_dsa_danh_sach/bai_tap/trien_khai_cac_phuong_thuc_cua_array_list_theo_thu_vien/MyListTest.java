package bai10_DSA_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_array_list_theo_thu_vien;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(2,9);

        System.out.println("element 4: "+myList.get(4));
        System.out.println("element 1: "+myList.get(1));
        System.out.println("element 2: "+myList.get(2));

        myList.remove(3);
        System.out.println("remove element 4: "+myList.get(3));
    }
}
