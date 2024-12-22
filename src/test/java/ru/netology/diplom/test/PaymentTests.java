package ru.netology.diplom.test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.netology.diplom.data.SQLHelper;
import ru.netology.diplom.paymentdata.PaymentData;

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

        var paymentData = new PaymentData();
        paymentData.validForm();
        Assertions.assertEquals("APPROVED", SQLHelper.getStatusPayment());

    }

    @Test
    void ShouldSendFormWithValidDataDeclined() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.invalidForm();
        Assertions.assertEquals("DECLINED", SQLHelper.getStatusPayment());

    }

    @Test
    void ShouldSendFormWithoutCardNumber() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithoutCardNumber();

    }

    @Test
    void ShouldSendFormWithoutMonth() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithoutMonth();

    }

    @Test
    void ShouldSendFormWithoutYear() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithoutYear();

    }

    @Test
    void ShouldSendFormWithoutCvc() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithoutCvc();

    }

    @Test
    void ShouldSendEmptyForm() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.emptyForm();

    }

    @Test
    void ShouldSendFormWithCardNumberFieldNotFullyFilled() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.cardNumberFilledNotFully();

    }

    @Test
    void ShouldSendFormWithNotCorrectMonth() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithNotCorrectMonth();

    }

    @Test
    void ShouldSendFormWithNotExistMonth() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithNotExistMonth();

    }

    @Test
    void ShouldSendFormWithPastYear() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithPastYear();

    }

    @Test
    void ShouldSendFormWithNumbersInOwnerField() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithNumbersInOwnerField();

    }

    @Test
    void ShouldSendFormWithOnlyNumbersInOwnerField() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithOnlyNumbersInOwnerField();

    }

    @Test
    void ShouldSendFormWithSpecialCharactersInOwnerField() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithSpecialCharactersInOwnerField();

    }

    @Test
    void ShouldSendFormWithNotCompletelyFilledFieldCvc() {
        open("http://localhost:8080");

        var paymentData = new PaymentData();
        paymentData.formWithNotCompletelyFilledFieldCvc();

    }




}
