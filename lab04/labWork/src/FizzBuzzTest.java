import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest {
    private int t1;
    private int t2;
    private int t3;
    private int t4;
    private FizzBuzz fiz;
    private String result;


    @BeforeEach
    void setUp(){
        this.fiz = new FizzBuzz();
        this.result = "";
        this.t1 = 3;
        this.t2 = 5;
        this.t3 = 15;
        this.t4 = 14;
    }

    @AfterEach
    void tearDown(){

    }

    @Test
    void fizz_test(){
        result = fiz.check(t1);
        assertEquals("Fizz", result);
    }

    @Test
    void buzz_test(){
        result = fiz.check(t2);
        assertEquals("Buzz", result);
    }

    @Test
    void fizz_buzz_test(){
        result = fiz.check(t3);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void not_dividable(){
        result = fiz.check(t4);
        System.out.println(result);
        assertEquals(String.valueOf(t4), result);
    }
}
