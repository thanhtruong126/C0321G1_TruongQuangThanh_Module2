package bai10_DSA_danh_sach.thuc_hanh.trien_khai_lop_list_don_gian;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Phuong thuc tang gap doi kich thuoc mang chua cac phan tu
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    //Phuong thuc them mot phan tu vao cuoi danh sach cua mang
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    //Phuong thuc tra ve phan tu vi tri thu i trong danh sach
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
