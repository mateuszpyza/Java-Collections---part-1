package OwnList;

import OwnList.MyOwnList;

public class Main {
    public static void main(String[] args) {
        Integer[] list = new Integer[]{1, 1, 2, 3, 2, 5, 5, 6, 3, 4, 3};
        MyOwnList ownList = new MyOwnList(list);
        System.out.println(ownList.size());
        ownList.print();
        ownList.add(666);
        ownList.print();
        ownList.add(999);
        ownList.print();
        System.out.println(ownList.size());
        ownList.add(0, 7777777);
        ownList.print();
        System.out.println(ownList.remove(14));
        ownList.print();
        MyOwnList secondOwnList= new MyOwnList();
        System.out.println();
        System.out.println(secondOwnList.size());
        System.out.println(secondOwnList.isEmpty());
        secondOwnList.add(666);
        secondOwnList.print();
        System.out.println(secondOwnList.get(1));




    }
}
