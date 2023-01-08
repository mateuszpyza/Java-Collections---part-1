package person;

import java.util.Set;
import java.util.TreeSet;

public class Person implements Comparable<Person> {

    private final String firstName;
    private final String surname;
    private final int yearOfBirth;
    double height;
    double weight;

    public Person(String firstName, String surname, int yearOfBirth, double height, double weight) {
        this.firstName = firstName;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(o.yearOfBirth, this.yearOfBirth);

    }

    @Override
    public String toString() {
        return "Nazywam się " + this.firstName + " " + this.surname + " moja data urodzenia to " + this.yearOfBirth + ", mam " + this.height + "cm wzrostu i ważę " + weight + "\n";
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

