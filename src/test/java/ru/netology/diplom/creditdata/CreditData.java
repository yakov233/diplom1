package ru.netology.diplom.creditdata;

import com.codeborne.selenide.SelenideElement;
import ru.netology.diplom.data.DataHelper;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CreditData {

    public void validForm() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getValidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$$(".notification").first().shouldBe(visible, Duration.ofSeconds(10));
    }

    public void invalidForm() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getInvalidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$$(".notification").first().shouldBe(visible, Duration.ofSeconds(10));
    }

    public void formWithoutCardNumber() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void formWithoutMonth() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getRandomValidCardNumber());
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void formWithoutYear() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getRandomValidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void formWithoutCvc() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getRandomValidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void emptyForm() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void cardNumberFilledNotFully() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getCardNumberFieldNotFullyFilled());
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void formWithNotCorrectMonth() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getRandomValidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getNotCorrectMonth());
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void formWithNotExistMonth() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getRandomValidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getNotExistMonth());
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void formWithPastYear() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getRandomValidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[placeholder='22']").setValue(DataHelper.getPastYear());
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void formWithNumbersInOwnerField() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getRandomValidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getNumbersInOwnerField());
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void formWithOnlyNumbersInOwnerField() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getRandomValidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getOnlyNumbersInOwnerField());
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void formWithSpecialCharactersInOwnerField() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getRandomValidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getSpecialCharactersInOwnerField());
        form.$("[placeholder='999']").setValue(DataHelper.getValidCvcCode());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

    public void formWithNotCompletelyFilledFieldCvc() {
        SelenideElement form = $(".App_appContainer__3jRx1");
        form.$$(".button").last().click();
        form.$("[placeholder='0000 0000 0000 0000']").setValue(DataHelper.getRandomValidCardNumber());
        form.$("[placeholder='08']").setValue(DataHelper.getValidMonth(1));
        form.$("[placeholder='22']").setValue(DataHelper.getValidYear(2));
        form.$("[value='']").setValue(DataHelper.getValidName("en"));
        form.$("[placeholder='999']").setValue(DataHelper.getNotCompletelyFilledFieldCvc());
        form.$$(".button").last().click();
        form.$(".input__sub").shouldBe(visible);
    }

}
