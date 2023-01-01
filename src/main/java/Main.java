import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeusz", "Anna", "Karolina", "Dorota", "Piotr");
        System.out.println("Lista bez duplikatów: " + OperationOnList.deleteDuplicates(names) + "\n");
        System.out.println("Elementy w odwrotnej kolejności: " + OperationOnList.reversElements(names) + "\n");
        System.out.println("Elementy po zmianie : Anna -> Joanna:");
        System.out.println(OperationOnList.replaceElements(names, "Anna", "Joanna"));


    }


}
