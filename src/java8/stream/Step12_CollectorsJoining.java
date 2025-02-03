package java8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Step12_CollectorsJoining {

    public static void main(String[] args) {

        Stream<Car> names = getStream();

        // joining - concatena de um Stream<String> em um único String

         String brands = names.map(Car::brand).collect(Collectors.joining(", "));
         System.out.println(brands);

//        com prefixo e sufixo
//        String brands2 = names.map(Car::brand).collect(Collectors.joining(", ", "[", "]"));


    }

    private static Stream<Car> getStream() {

        return Stream.of(
                new Car("Ferrari"),
                new Car("Lamborghini"),
                new Car("Hyundai"),
                new Car("Chevrolet"),
                new Car("Honda")
        );
    }
}

record Car(String brand){}
