package person;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Ania", "Barańska", 1990, 175, 60));
        persons.add(new Person("Ola", "Kowalska", 1997, 163, 50));
        persons.add(new Person("Kasia", "Dec", 2000, 170, 66));
        persons.add(new Person("Tomasz", "Musiał", 1985, 184, 87));
        System.out.println("Sortowanie po roku urodzenia:");
        System.out.println(persons);

        Set<Person> personsHeightCustomSort = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println("Sortowanie po wzroście:");
        personsHeightCustomSort.addAll(persons);
        System.out.println(personsHeightCustomSort);

        Set<Person> personsWeightCustomSort = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o2.getWeight(), o1.getWeight());
            }

        });
        System.out.println("Sortowanie po wadze:");
        personsWeightCustomSort.addAll(persons);
        System.out.println(personsWeightCustomSort);


    }
}
