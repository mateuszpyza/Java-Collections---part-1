package OwnList;

import OwnList.OwnList;

import java.util.Arrays;

public class MyOwnList implements OwnList {


    public Integer[] list;

    public MyOwnList() {
    }

    public MyOwnList(Integer[] list) {
        this.list = list;
    }

    public void print() {
        System.out.println(Arrays.toString(list));
    }


    @Override
    public int size() {
        if (list != null)
            return list.length;
        else {
            System.out.println("List is empty!");
            return 0;
        }
    }

    @Override
    public boolean isEmpty() {
        if (list == null)
            return true;
        else if (list.length == 0)
            return true;
        return false;
    }

    @Override
    public void add(Integer element) {
        int length = 0;
        if (list != null)
            length = list.length;
        Integer[] localTable = new Integer[length + 1];
        for (int i = 0; i < length; i++) {
            localTable[i] = list[i];
        }
        localTable[length] = element;
        this.list = localTable;

    }

    @Override
    public Integer get(int i) {
        if (list.length > i && i >= 0)
            return list[i];
        else {
            System.out.println("Index out of bounds,addition is impossible.");
            return 0;
        }

    }

    @Override
    public void add(int index, Integer element) {
        if (list.length > index && index >= 0) {
            int length = list.length;
            Integer[] localTable = new Integer[length + 1];
            int listIterator = 0;
            for (int i = 0; i <= length; i++) {
                if (index != i) {
                    localTable[i] = list[listIterator];
                    listIterator++;

                } else {
                    localTable[i] = element;
                }

            }
            this.list = localTable;
        } else {
            System.out.println("Index out of bounds,addition is impossible.");
        }
    }

    @Override
    public Integer remove(int index) {
        if (list.length > index && index >= 0) {
            Integer deletedElement = list[index];
            int length = list.length;
            Integer[] localTable = new Integer[length - 1];
            int listIterator = 0;
            for (int i = 0; i < length; i++) {
                if (index != i) {
                    localTable[listIterator] = list[i];
                    listIterator++;
                }
            }
            this.list = localTable;
            return deletedElement;
        } else {
            System.out.println("Index out of bounds,removal is impossible.");
        }
        return 0;
    }
}
