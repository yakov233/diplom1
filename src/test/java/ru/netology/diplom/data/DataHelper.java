package ru.netology.diplom.data;

import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHelper {

    @Value
    public static class AuthInfo {
        String cardNumber;
        String cardMonth;
        String cardYear;
        String cardHolder;
        String cvc;
    }

    public static String getValidCardNumber() {
        return "4444 4444 4444 4441";
    }

    public static String getInvalidCardNumber() {
        return "4444 4444 4444 4442";
    }

    public static String getCardNumberFieldNotFullyFilled() {
        return "4444 4444 4444 444";
    }

    public static String getNotCorrectMonth() {
        return "13";
    }

    public static String getNotExistMonth() {
        return "0";
    }

    public static String getPastYear() {
        return "20";
    }

    public static String getNumbersInOwnerField() {
        return "Vasiliy23";
    }

    public static String getOnlyNumbersInOwnerField() {
        return "23";
    }

    public static String getSpecialCharactersInOwnerField() {
        return ".";
    }

    public static String getNotCompletelyFilledFieldCvc() {
        return "55";
    }

    public static String getValidName(String locale) {
        Faker faker = new Faker(new Locale("en"));
        return faker.name().firstName();
    }

    public static String getRandomValidCardNumber() {
        Faker faker = new Faker(new Locale("en"));
        return faker.business().creditCardNumber();
    }

    public static String getValidCvcCode() {
        Faker faker = new Faker(new Locale("en"));
        return faker.numerify("###");
    }

    public static String getValidMonth(int count) {
        return LocalDate.now().plusMonths(count).format(DateTimeFormatter.ofPattern("MM"));
    }

    public static String getValidYear(int count) {
        return LocalDate.now().plusYears(count).format(DateTimeFormatter.ofPattern("yy"));
    }


}