package bai10_DSA_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_array_list_theo_thu_vien;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa(size + 1);
        }
        for (int i = elements.length - 1; i > index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public E remove(int index) {
        E ElementRemove = (E) elements[index];
        for (int i = index; i < elements.length; i++) {
            elements[i] = elements[i+1];
        }
        this.size--;
        return ElementRemove;
    }

    public E clone() {
        MyList<E> v = new MyList<>();
        v.elements = Arrays.copyOf(elements, size);
        return (E) v;
    }

    public boolean contains (E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i]==null) {
                    return 1;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public boolean add(E o) {
        if (size == elements.length) {
            ensureCapa(size + 1);
        }
        elements[size++] = o;
        return true;
    }

    public void ensureCapa(int minCapacity) {
        if (minCapacity - elements.length > 0) {
            elements = Arrays.copyOf(elements, minCapacity);
        }
    }

    public E get(int index) {
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) elements[index];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
