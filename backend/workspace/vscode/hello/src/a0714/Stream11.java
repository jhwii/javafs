package a0714;

import java.util.Arrays;
import java.util.List;

public class Stream11 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", 25),
                new User("Bob", 30),
                new User("Charlie", 20),
                new User("David", 22));
        int totalAge = users.stream()
                .mapToInt(User::getAge)
                .sum();
        System.out.println(totalAge); // 97
    }
}
