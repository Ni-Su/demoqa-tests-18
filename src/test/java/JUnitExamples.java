import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

public class JUnitExamples {
    @BeforeAll
    static void beforeALL(){
        System.out.println("Here is beforeALL()");
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Here is beforeEach()");
    }
    @AfterAll static void afterAll(){
        System.out.println("Here is afterALL()");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Here is afterEach()");
    }
    @Test
     void firstTest() {
        System.out.println("Here is firstTest()");
    }

    @Test
    void secondTest() {
        System.out.println("Here is secondTest()");
    }

    @Test
    void fillFormTest() {
        open("/text-box");
    }
}