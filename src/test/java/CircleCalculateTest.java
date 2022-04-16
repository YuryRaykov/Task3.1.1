import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

//import static org.hamcrest.Matchers.closeTo;

public class CircleCalculateTest {
    CircleCalculate sut;

   @BeforeEach
    public void init() {
        System.out.println("tests started");
        sut = new CircleCalculate();
    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test completed");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests completed");
    }

    @Test
    public void testCalculateCircleLength() {
        int radius = 100;
        double expected = 628.00;
        //double PI = 3.14;
        //int expected = 628;
        double result = sut.calculateCircleLength(radius);
       // assertEquals(expected, result);
        assertThat(expected,equalTo(result));
    }

    @Test
    public void testCalculateCircleSector() {
        int radius = 100;
        double expected = 157.00;
        double result = sut.calculateCircleSector(radius);
      // assertEquals(expected, result);
        //Assert.assertThat(expected,equalTo(result));
        assertThat(result, closeTo(expected, 0.1));
    }

    @Test
    public void testCalculateCircleArea() {
        int radius = 10;
        double expected = 314.00;
        double result = sut.calculateCircleArea(radius);
       // assertEquals(expected, result);
        assertThat(expected,equalTo(result));
    }

    @Test
    public void testMassege() {

        String string = sut.Massege();

        assertThat(string, equalTo("Всё хорошо"));

    }

    @Test
    public void testLenghtRadius() {

        int radius = 1000;

        final int expected = 4;

        int result = sut.LenghtRadius(radius);

        //Assert.assertThat(expected,equalTo(result));
        assertThat(expected,equalTo(result));
    }
}
