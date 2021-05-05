package dev.smirnoff.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author pavelsmirnov
 * @version 1.0
 * дата создания 21.03.2021
 */
@Data
public class User {
    private int id;
    private String name;
    private byte age;
    private Sex sex;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static Map<Integer, User> allUsers = new HashMap<>();
    private static int countId = 0;

    public User(String name, int age, Sex sex) {
        if (name != null && !name.isEmpty() && age > 0 && age < 127 && sex != null) {
            this.name = name;
            this.age = (byte) age;
            this.sex = sex;

            if (!hasUser()) {
                countId++;
                this.id = countId;
                allUsers.put(id, this);
            }
        }
    }

    private boolean hasUser() {
        for (User user : allUsers.values()) {
            if (user.equals(this) && user.hashCode() == this.hashCode())
                return true;
        }
        return false;
    }

    public static List<User> getAllUsers() {
        return new ArrayList<>(allUsers.values());
    }

    public static List<User> getAllUsers(Sex sex) {
        return allUsers.values().stream().filter(u -> u.sex == sex).collect(Collectors.toList());
    }

    public static int getHowManyUsers() {
        return getAllUsers().size();
    }

    public static int getHowManyUsers(Sex sex) {
        return getAllUsers(sex).size();
    }

    public static int getAllAgeUsers() {
        return getAllUsers().stream().mapToInt(x -> x.age).sum();
    }

    public static int getAllAgeUsers(Sex sex) {
        return getAllUsers(sex).stream().mapToInt(x -> x.age).sum();
    }

    public static int getAverageAgeOfAllUsers() {
        return (int) getAllUsers().stream().mapToInt(x -> x.age).summaryStatistics().getAverage();
    }

    public static int getAverageAgeOfAllUsers(Sex sex) {
        return (int) getAllUsers(sex).stream().mapToInt(x -> x.age).summaryStatistics().getAverage();
    }
}
