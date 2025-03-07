package Java8.Lambdas.apidefault;

public class User {

    private final String name;
    private final Integer age;

    private User(UserBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
    }


    public static class UserBuilder {

        private String name;
        private Integer age;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
