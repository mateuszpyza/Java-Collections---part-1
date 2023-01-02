public class Main {
    public static void main(String[] args) {
        Integer[] list = new Integer[]{1, 1, 2, 3, 2, 5, 5, 6, 3, 4, 3};
        OwnList ownList = new OwnList(list);
        System.out.println(ownList.size());
        ownList.print();
        ownList.add(666);
        ownList.print();
        ownList.add(999);
        ownList.print();
        ownList.add(10, 7777777);
        ownList.print();
        System.out.println(ownList.remove(10));
        ownList.print();
    }
}
