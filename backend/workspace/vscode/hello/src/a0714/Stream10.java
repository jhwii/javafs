package a0714;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Stream10 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", 25),
                new User("Bob", 30),
                new User("Charlie", 20),
                new User("David", 22));
        Optional<User> youngestUser = users.stream()
                .filter(user -> user.getAge() >= 20)
                .min(Comparator.comparing(User::getName));
        System.out.println(youngestUser); //
    }
}
