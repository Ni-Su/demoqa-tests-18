import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeALL(){
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest() {
        open("/text-box");

        $("id=userName").setValue("Nick Fox");
        $("#userEmail").setValue("Nick@Fox.wo");
        $("#currentAddress").setValue("Nick, Fox 14");
        $("#permanentAddress").setValue("Fox, Nick 17");
        $("[id=submit]").click();

        $("#output").shouldHave(text("Nik Fox"),
                text("Nik@Fox.wo"), text("Nik, Fox 14"), text("Fox, Nik 17"));
    }
}
