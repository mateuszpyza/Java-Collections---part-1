package BidirectionalList;

public class BidirectionalList {

    Node head;
    Node tail;


    public void add(String data) {
        Node newNode = new Node(data);
        newNode.setNext(null);
        if (head == null) {
            newNode.setIndex(0);
            head = tail = newNode;
            head.setPrevious(null);
            tail.setNext(null);

        } else {
            newNode.setIndex(tail.getIndex() + 1);
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
            tail.setNext(null);
        }
    }

    public void print() {
        Node current = head;
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            System.out.print(current.getIndex() + "." + current.getData() + " ");
            current = current.getNext();

        }
    }

    public void add(Integer index, String data) {

        if (index > tail.getIndex()+1 || index < 0) throw new IndexOutOfBoundsException();

        if (index == 0) {
            Node newNode = head;
            head.getNext().setPrevious(newNode);
            head = new Node(data);
            head.setNext(newNode);
            head.setPrevious(null);
            newNode.setPrevious(head);
            while (newNode != null) {
                newNode.setIndex(index + 1);
                newNode = newNode.getNext();
                index++;
            }
        } else if ( index < tail.getIndex()+1) {
            Node newNode = new Node(data);
            newNode.setIndex(index);
            index = index - 1;
            Node previousNode = head;
            while (previousNode.getIndex() != tail.getIndex() - 1 && previousNode.getIndex() != index) {
                previousNode = previousNode.getNext();
            }
            Node nextNode = previousNode.getNext();
            previousNode.setNext(newNode);
            newNode.setPrevious(previousNode);
            newNode.setNext(nextNode);
            nextNode.setPrevious(newNode);
            index = index + 2;
            while (nextNode != null) {
                nextNode.setIndex(index);
                nextNode = nextNode.getNext();
                index++;
            }
        } else if (index == tail.getIndex()+1) {
            Node previousTail = tail;
            tail= new Node(data);
            tail.setPrevious(previousTail);
            tail.setNext(null);
            previousTail.setNext(tail);
            tail.setIndex(index);
        }
    }
    public void remove(Integer index){
        if (index > tail.getIndex() || index < 0) throw new IndexOutOfBoundsException();
        if (index==0){
            head = head.getNext();
            head.setPrevious(null);
            Node current = head;
            for (int i = head.getIndex()-1; i<=tail.getIndex() ; i++){
                current.setIndex(i);
                current=current.getNext();
            }

        } else if (index<tail.getIndex()) {
            Node toRemove = head;
            while (toRemove.getIndex() != index ){
                toRemove=toRemove.getNext();
            }

            Node previousNode =toRemove.getPrevious();
            Node nextNode= toRemove.getNext();
            previousNode.setNext(nextNode);
            nextNode.setPrevious(previousNode);
            for (int i = previousNode.getIndex()+1; i<=tail.getIndex() ; i++){
                nextNode.setIndex(i);
                nextNode=nextNode.getNext();
            }

        } else if (index==tail.getIndex()) {
            tail=tail.getPrevious();
            tail.setNext(null);
        }
        Node current = head;
        int i =0;
        while (current !=null){
            current = current.getNext();
          //  current.setIndex(5);
        }
    }


    public Integer size() {
        return tail.getIndex() + 1;
    }
}




