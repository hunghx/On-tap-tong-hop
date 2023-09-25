package ra.util;



public class ArrayTest<T> {
    private Object[] array;
    private int count;

    public ArrayTest() {
        this.array = new Object[100];
    }


//    public T[] findAll() {
//        return (T[]) array;
//    }


    public T get(int index) {
        return (T) array[index];
    }


    public void add(T t) {
        if (count == array.length){
            System.err.println("danh sách đầy");
            return;
        }
        array[count] = t;
        count++;
    }


    public void delete(int index) {
        if(index<0 || index>=count){
            System.err.println("index không hợp lệ");
            return;
        }
        for (int i = index; i < count -1 ; i++) {
            array[i] = array[i+1];
        }
        //  gán lại phần tử cuối  = null;
        array[count-1] =null;
        count--;
    }


    public void update(int index, T t) {
        if(index<0 || index>=count){
            System.err.println("index không hợp lệ");
            return;
        }
        array[index] = t;
    }

    public int getCount() {
        return count;
    }

}
