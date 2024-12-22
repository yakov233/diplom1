package ru.netology.diplom.test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.diplom.creditdata.CreditData;
import ru.netology.diplom.data.SQLHelper;

import static com.codeborne.selenide.Selenide.open;

public class CreditTests {

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

        var creditData = new CreditData();
        creditData.validForm();
        Assertions.assertEquals("APPROVED", SQLHelper.getStatusCredit());

    }

    @Test
    void ShouldSendFormWithValidDataDeclined() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.invalidForm();
        Assertions.assertEquals("DECLINED", SQLHelper.getStatusCredit());

    }

    @Test
    void ShouldSendFormWithoutCardNumber() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithoutCardNumber();

    }

    @Test
    void ShouldSendFormWithoutMonth() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithoutMonth();

    }

    @Test
    void ShouldSendFormWithoutYear() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithoutYear();

    }

    @Test
    void ShouldSendFormWithoutCvc() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithoutCvc();

    }

    @Test
    void ShouldSendEmptyForm() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.emptyForm();

    }

    @Test
    void ShouldSendFormWithCardNumberFieldNotFullyFilled() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.cardNumberFilledNotFully();

    }

    @Test
    void ShouldSendFormWithNotCorrectMonth() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithNotCorrectMonth();

    }

    @Test
    void ShouldSendFormWithNotExistMonth() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithNotExistMonth();

    }

    @Test
    void ShouldSendFormWithPastYear() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithPastYear();

    }

    @Test
    void ShouldSendFormWithNumbersInOwnerField() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithNumbersInOwnerField();

    }

    @Test
    void ShouldSendFormWithOnlyNumbersInOwnerField() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithOnlyNumbersInOwnerField();

    }

    @Test
    void ShouldSendFormWithSpecialCharactersInOwnerField() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithSpecialCharactersInOwnerField();

    }

    @Test
    void ShouldSendFormWithNotCompletelyFilledFieldCvc() {
        open("http://localhost:8080");

        var creditData = new CreditData();
        creditData.formWithNotCompletelyFilledFieldCvc();

    }

    

}
