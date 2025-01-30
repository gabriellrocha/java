package advanced.interfaces.ordination;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class InterfaceComparator {

    public static void main(String[] args) {

        // Define um critério de comparação entre objetos

        // Comparator - Permite definir ordenações personalizadas FORA da classe.
        // Útil quando precisa definir diferentes critérios


       Comparator<Student> compByName = (student, other) -> {
           return student.name().compareTo(other.name());
       };

        Comparator<Student> compByAge = (student, other) -> { // apenas para exemplo
            if (student.age() > other.age()) return 1; // positivo se this > other
            if (student.age() < other.age()) return -1; // negativo se this < other
            return 0;
        };


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
                .sorted(compByName.thenComparing(compByAge))
                .forEach(System.out::println);

    }
}

record Student(String name, Integer age)  {

}