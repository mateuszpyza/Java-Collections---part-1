import java.util.Arrays;

public class OwnList implements interfaces.OwnList {


    public Integer[] list;

    public OwnList() {
    }

    public OwnList(Integer[] list) {
        this.list = list;
    }

    public void print() {
        System.out.println(Arrays.toString(list));
    }


    @Override
    public int size() {
        return list.length;
    }

    @Override
    public boolean isEmpty() {
        return list.length == 0;
    }

    @Override
    public void add(Integer element) {
        int length = list.length;
        int[] localTable = new int[length];
        for (int i = 0; i < length; i++) {
            localTable[i] = list[i];
        }
        list = new Integer[length + 1];
        for (int i = 0; i < length; i++) {
            list[i] = localTable[i];
        }
        list[length] = element;
    }

    @Override
    public Integer get(int i) {
        return list[i];
    }

    @Override
    public void add(int index, Integer element) {
        try {
            list[index] = element;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Input data problems!");
        }
    }

    @Override
    public Integer remove(int index) {
        try {
            Integer deletedElement = list[index];
            int length = list.length;
            int[] localTable = new int[length];
            int j = 0;
            for (int i = 0; i < length; i++) {
                if (index != i) {
                    localTable[j] = list[i];
                    j++;
                }
            }
            list = new Integer[length];
            for (int i = 0; i < length; i++) {
                list[i] = localTable[i];
            }

            return deletedElement;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Input data problems!");
        }
    }
}
