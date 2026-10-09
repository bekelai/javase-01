public class MyList<E> {
    private Object[] array;      // 真正装东西的地方
    private int capacity;        // 容量:这个数组一共能装多少个
    private int size;            // 个数:现在实际装了几个

    public MyList() {
        capacity = 10;
        array = new Object[capacity];
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
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

    public int size() {
        return size;
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
        // 测试:new 一个 MyList<String>,加几个、插一个、删一个、打印看看
        MyList<String> array = new MyList<>();
        array.add("a");
        array.add("c");
        array.add(1, "b");
        array.get(2);
        array.remove(1);
        System.out.println(array.toString());
    }
}
