package task2.utils;

import com.github.javafaker.Faker;

public class DataGenerator {

    private static final Faker faker = new Faker();
    private static final String fixedUsername = faker.name().username();
    private static final String fixedPassword = faker.internet().password();

    public static String generateUsername() {
        return fixedUsername;
    }

    public static String generatePassword() {
        return fixedPassword;
    }
}
