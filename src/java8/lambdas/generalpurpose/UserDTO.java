package java8.lambdas.generalpurpose;

public class UserDTO {

    // Apenas para exemplos. 'Eu' do futuro não me julgue rs

    private final String name;

    public UserDTO(User user) {
        this.name = user.getName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
