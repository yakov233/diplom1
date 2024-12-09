package ru.netology.diplom.test;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class PaymentTests {

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }


    @Test
    void ShouldSendFormWithValidDataApproved() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='08']").setValue("10");
        form.$("[placeholder='22']").setValue("25");
        form.$("[value='']").setValue("Vasiliy");
        form.$("[placeholder='999']").setValue("555");
        form.$$(".button").last().click();
        form.$$(".notification").first().shouldBe(visible, Duration.ofSeconds(10));
    }

    @Test
    void ShouldSendFormWithValidDataDeclined() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4442");
        form.$("[placeholder='08']").setValue("09");
        form.$("[placeholder='22']").setValue("26");
        form.$("[value='']").setValue("Anna");
        form.$("[placeholder='999']").setValue("444");
        form.$$(".button").last().click();
        form.$$(".notification").first().shouldBe(visible, Duration.ofSeconds(10));
    }

    @Test
    void ShouldSendFormWithoutCardNumber() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='08']").setValue("11");
        form.$("[placeholder='22']").setValue("25");
        form.$("[value='']").setValue("Petr");
        form.$("[placeholder='999']").setValue("333");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithoutMonth() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='22']").setValue("28");
        form.$("[value='']").setValue("Victor");
        form.$("[placeholder='999']").setValue("123");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithoutYear() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='08']").setValue("10");
        form.$("[value='']").setValue("Vladimir");
        form.$("[placeholder='999']").setValue("162");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithoutCvc() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='08']").setValue("10");
        form.$("[placeholder='22']").setValue("25");
        form.$("[value='']").setValue("Sasha");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendEmptyForm() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithCardNumberFieldNotFullyFilled() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 444");
        form.$("[placeholder='08']").setValue("10");
        form.$("[placeholder='22']").setValue("25");
        form.$("[value='']").setValue("Vasiliy");
        form.$("[placeholder='999']").setValue("555");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithNotCorrectMonth() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='08']").setValue("13");
        form.$("[placeholder='22']").setValue("25");
        form.$("[value='']").setValue("Vasiliy");
        form.$("[placeholder='999']").setValue("555");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithNotExistMonth() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='08']").setValue("0");
        form.$("[placeholder='22']").setValue("25");
        form.$("[value='']").setValue("Vasiliy");
        form.$("[placeholder='999']").setValue("555");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithPastYear() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='08']").setValue("10");
        form.$("[placeholder='22']").setValue("20");
        form.$("[value='']").setValue("Vasiliy");
        form.$("[placeholder='999']").setValue("555");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithNumbersInOwnerField() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='08']").setValue("10");
        form.$("[placeholder='22']").setValue("27");
        form.$("[value='']").setValue("Vasiliy23");
        form.$("[placeholder='999']").setValue("555");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithOnlyNumbersInOwnerField() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='08']").setValue("10");
        form.$("[placeholder='22']").setValue("27");
        form.$("[value='']").setValue("23");
        form.$("[placeholder='999']").setValue("555");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithSpecialCharactersInOwnerField() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='08']").setValue("10");
        form.$("[placeholder='22']").setValue("27");
        form.$("[value='']").setValue(".");
        form.$("[placeholder='999']").setValue("555");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    @Test
    void ShouldSendFormWithNotCompletelyFilledFieldCvc() {
        open("http://localhost:8080");

        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").first().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue("4444 4444 4444 4441");
        form.$("[placeholder='08']").setValue("10");
        form.$("[placeholder='22']").setValue("27");
        form.$("[value='']").setValue("Vasiliy");
        form.$("[placeholder='999']").setValue("55");
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }




}
