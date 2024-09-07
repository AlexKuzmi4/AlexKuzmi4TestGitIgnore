package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
       Configuration.baseUrl = "https://demoqa.com";
        // Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
    open("/text-box");

   // $("[id=userName]").setValue("Alex Kuzmi4") (id=) = #,  меняем следующую строку
        $("#userName").setValue("Alex Kuzmi4");
        $("#userEmail").setValue("kuzm5@mail.ru");
        $("#currentAddress").setValue("One Adresse 1");
        $("#permanentAddress").setValue("Same Adresse 2");
        $("#submit").click();


        $("#output #name").shouldHave(text("Alex Kuzmi4"));
        $("#output #email").shouldHave(text("kuzm5@mail.ru"));
        $("#output #currentAddress").shouldHave(text("One Adresse 1"));
        $("#output #permanentAddress").shouldHave(text("Same Adresse 2"));

// можно добавить негативных тестов на невалидные значения (емайл без @)

    }
}
