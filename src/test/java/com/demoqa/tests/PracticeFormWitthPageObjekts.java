package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;




public class PracticeFormWitthPageObjekts extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();


    @Test
    void automaticPracticeForm() {
        registrationPage.openPage()
                        .setFirstName("Alex")
                        .setLastName("Kuzmi4")
                        .setUserEmail("kuzm5@mail.ru")
                        .setUserNumber("1234567890")
                        .setGender("Male")
                        .setBirthDate("01", "August", "1968"  )
                        .setSubjects("Physics")
                        .setHobbies("Sports")
                        .setFile("src/test/resources/img/1.png")
                        .setAddress("Gazetnaya 88")
                        .setState("NCR")
                        .setCity("Delhi")
                        .checkModalWindow("Thanks for submitting the form")
                        .checkResult("Alex")
                        .checkResult("Kuzmi4")
                        .checkResult("kuzm5@mail.ru");

        //  $(".table-responsive").shouldHave(text("Alex"), text("Kuzmi4"), text("kuzm5@mail.ru"));
        //  registrationPage.setFirstName("Alex");
        //  registrationPage.setLastName("Kuzmi4");
        //  registrationPage.setUserEmail("kuzm5@mail.ru");
        //  $("#userNumber").setValue("1234567890");
        //  $("#gender-radio-1").parent().click();
        //   registrationPage.setsetGender("Male");
        //  $("#gender-radio-1").parent().click(); // also check radiobutton
        //   $("#genterWrapper").$(byText("Male")).click(); //best
        //  $(byText("Male")).click(); тоже способ активировать радиобаттон
        //  $("label[for=gender-radio-1]").click(); also posiible
        //   $("#dateOfBirthInput").click();
        //    $(".react-datepicker__month-select").selectOption("August");
        //  $(".react-datepicker__month-select").selectOptionByValue("8"); so also can choose "August" in select
        //   $(".react-datepicker__year-select").selectOption("1968");
        //   $(".react-datepicker__day--001:not(.react-datepicker__day--outside-month)").click(); // found differnts from dates in datapickers
        //  $("#subjectsInput").setValue("Physics").pressEnter();
        //   $("#hobbiesWrapper").$(byText("Sports")).click(); // so to test check-boxes
        // $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png")); // it's also the method for upload files
        //  $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));
        // $("#uploadPicture").uploadFromClasspath("img/1.png");
        //  $("#currentAddress").setValue("Gazetnaya 88");
        //  $("#state").click();
        //   $("#stateCity-wrapper").$(byText("NCR")).click();
        //  $("#city").click();
        //   $("#stateCity-wrapper").$(byText("Delhi")).click();
        //   $("#submit").click();
        //   $(".modal-dialog").should(appear);
        //     $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
    }
}
