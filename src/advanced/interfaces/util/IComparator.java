package advanced.interfaces.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IComparator {

    /* Interface Comparator:

        - Fornece uma ordem personalizada
        - Ordering(ordenar) os objetos de acordo critérios específicos
     */

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("Gabriel", 25),
                new Student("Gabriel", 23),
                new Student("João", 16),
                new Student("João", 11),
                new Student("Maria", 12),
                new Student("Rebeca", 6),
                new Student("Zoe", 4)

        ));

        students.stream()
                .sorted(Comparator
                        .comparing(Student::age)       // encadeamento de comparações
                        .thenComparing(Student::name))
                .forEach(System.out::println);

    }
}

record Student(String name, Integer age) {}
