package BidirectionalList;

public class Main {
    public static void main(String[]args){
        BidirectionalList bidirectionalList = new BidirectionalList();
        bidirectionalList.add("Zerowy");
        bidirectionalList.add("Pierwszy");
        bidirectionalList.add("Drugi");
        bidirectionalList.add("Trzeci");
        bidirectionalList.add("Czwarty");
        bidirectionalList.add("Piąty");
        //bidirectionalList.add("Szusty");
        bidirectionalList.print();
        System.out.println();
        System.out.println("Lista składa się z "+bidirectionalList.size()+" elementów.");
        bidirectionalList.add(0,"############");
        bidirectionalList.print();
        bidirectionalList.remove(6);
        bidirectionalList.print();
    }
}
