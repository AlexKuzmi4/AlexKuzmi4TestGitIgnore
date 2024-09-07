package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

public class JUni5Examples {

    @BeforeAll
    static void beforeAll() {
         System.out.println("beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println(" afterEach");

    }

    @Test
    void firstTest() {
//        open("https://google.com");
        System.out.println("        firsTest");
        Assertions.assertTrue(3 > 2);

    }

    @Test
    void secondTest() {
        System.out.println("        secondTest");
        Assertions.assertTrue(3 > 2);

    }

    @Test
    void thirdTest() {
        System.out.println("        thirdTest");
        Assertions.assertTrue(3 > 2);

    }
}
