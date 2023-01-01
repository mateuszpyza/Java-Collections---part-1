import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class OperationOnList {
    public static List<String> replaceElements(List<String> list, String oldElement, String newElement) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldElement)) {
                list.set(i, newElement);
            }
        }
        return list;
    }

    public static List<String> deleteDuplicates(List<String> list) {
        HashSet<String> hashSet = new HashSet(list);
        List<String> newList = new ArrayList<String>(hashSet);
        return newList;
    }

    public static List<String> reversElements(List<String> list) {
        Collections.reverse(list);
        return list;
    }

}
