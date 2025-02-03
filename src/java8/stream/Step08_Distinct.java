package java8.stream;

import java.util.Objects;
import java.util.stream.Stream;

public class Step08_Distinct {

    public static void main(String[] args) {


        // Remove duplicatas com base no equals()

        Stream.of(new User("Gabriel"), new User("Maria"), new User("Gabriel"))
                .distinct()
                .forEach(System.out::println);
    }
}

class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
