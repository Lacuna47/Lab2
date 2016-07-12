import java.util.*;

/**
 * Created by Lacuna on 12.07.2016.
 */
public class MyLinkedList implements List {
    private int size;
    private Node top;

    public MyLinkedList() {
        size = 0;
    }

    private class Node {
        int value;
        Node next;

        public Node(Object value) {
            this.value = (Integer) value;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (size == 0)
            return false;
        Node cursor = top;
        do {
            if (o.equals(cursor.value))
                return true;
            cursor = cursor.next;
        } while (cursor.next != null);

        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (size == 0) {
            top = new Node(o);
            size++;
            return true;
        }
        Node cursor = top;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        cursor.next = new Node(o);
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (size == 0)
            return false;

        if (o.equals(top.value)) {
            top = top.next;
            size--;
            return true;
        }
        Node cursor = top;
        Node next = cursor.next;
        while (next != null) {
            if (o.equals(next.value)) {
                cursor.next = next.next;
                size--;
                return true;
            }
            cursor = next;
            next = next.next;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        top = null;
    }

    @Override
    public Object get(int index) {
        if (size == 0)
            return false;
        int i = 0;
        Node cursor = top;
        while (cursor != null) {

            if (i == index)
                return cursor.value;
            i++;
            cursor = cursor.next;
        }
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
