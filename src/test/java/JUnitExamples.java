import org.junit.jupiter.api.*;

public class JUnitExamples {
    @BeforeAll
    static void beforeALL(){
        System.out.println("Here is beforeALL()");
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
}