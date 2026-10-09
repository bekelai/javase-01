import java.util.Objects;

public class MyArrayList<E> {
    private Object[] array;      // 真正装东西的地方
    private int capacity;        // 容量:这个数组一共能装多少个
    private int size;            // 个数:现在实际装了几个

    public MyArrayList() {
        capacity = 10;
        array = new Object[capacity];
    }

    private void grow() {
        capacity = capacity + (capacity >> 1);
        Object[] bigger = new Object[capacity];
        for (int i = 0; i < size; i++) bigger[i] = array[i];
        array = bigger;
    }

    public boolean add(E element) {
        if (capacity == size) {
            grow();
        }
        array[size] = element;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
        }
        if (capacity == size) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
        }
        Object rem = array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        array[size] = null;
        return (E) rem;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
        }
        return (E) array[index];
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index:" + index + ",size:" + size);
        }
        Object old = array[index];
        array[index] = element;
        return (E) old;
    }

    public int indexOf(E element) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(array[i], element)) return i;
        }
        return -1;
    }

    public boolean contains(E element) {
        return indexOf(element) >= 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public String toString() {
        // 拼成 [a, b, c] 这样的字符串返回
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                str.append(array[i]);
            } else {
                str.append(", ");
                str.append(array[i]);
            }
        }
        str.append("]");
        return str.toString();

    }

    public static void main(String[] args) {
        MyArrayList<String> array = new MyArrayList<>();
        array.add("a");
        array.add("b");
        array.add("c");
        array.add(1, "ab");
        System.out.println(array.toString());
        array.remove(1);
        array.set(0, "z");
        System.out.println(array.toString());
        System.out.println("下标2：" + array.get(2));
        System.out.println("c第一次出现的下标:" + array.indexOf("c"));
        System.out.println("是否包含z:" + array.contains("z"));
        array.clear();
        System.out.println(array.toString());

    }
}
