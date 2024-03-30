package org.iffat.unmodifable_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringBuilder bobsNotes = new StringBuilder();
        StringBuilder billsNotes = new StringBuilder("Bill struggles with generics");

        Student bob = new Student("Bob", bobsNotes);
        Student bill = new Student("Bill", billsNotes);

        List<Student> students = new ArrayList<>(List.of(bob, bill));
        List<Student> studentFirstCopy = new ArrayList<>(students);
        List<Student> studentSecondCopy = List.copyOf(students);
        List<Student> studentThirdCopy = Collections.unmodifiableList(students);

        studentFirstCopy.add(new Student("Bonnie", new StringBuilder()));
        // studentSecondCopy.add(new Student("Bonnie", new StringBuilder()));
        // studentSecondCopy.sort(Comparator.comparing(Student::getName));
        bobsNotes.append("Bob was one of my first students.");

        StringBuilder bonniesNotes = studentFirstCopy.get(2).getStudentNotes();
        bonniesNotes.append("Bonnie is taking 3 of my courses");

        students.forEach(System.out::println);
        System.out.println("-".repeat(90));
        studentFirstCopy.forEach(System.out::println);
        System.out.println("-".repeat(90));
        studentSecondCopy.forEach(System.out::println);
        System.out.println("-".repeat(90));
        studentThirdCopy.forEach(System.out::println);
        System.out.println("-".repeat(90));
    }
}
