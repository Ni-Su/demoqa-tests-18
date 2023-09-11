import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextPracticeForm {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        $("#firstName").click();
        $("#firstName").val("Nick");
        $("#lastName").click();
        $("#lastName").val("Fox");
        $("#userEmail").click();
        $("#userEmail").val("nick@fox.ru");
        $(".custom-radio:nth-child(3) > .custom-control-label").click();
        $("#userNumber").click();
        $("#userNumber").val("3453453453");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__day--001:nth-child(2)").click();
        $(".subjects-auto-complete__value-container").click();
        $("#subjectsInput").val("subjects12");
        $(".custom-checkbox:nth-child(3) > .custom-control-label").click();
        //$("#uploadPicture").click();

        //$("#uploadPicture").val("C:\\Users\\sukhikhny\\Pictures\\Outlook 2 daily_rep.PNG");
        $("#currentAddress").click();
        $("#currentAddress").val("fox str 22");
        $(".css-1pahdxg-control .css-1wa3eu0-placeholder").click();
        $("#react-select-3-option-0").click();
        $(".css-1gtu0rj-indicatorContainer > .css-19bqh2r").click();
        $("#react-select-4-option-0").click();
        $("#submit").click();
        $("#closeLargeModal").click();
        $("body").click();
    }

}