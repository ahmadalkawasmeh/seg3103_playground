import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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
        assert(result == "Fizz");
    }

    @Test
    void buzz_test(){
        result = fiz.check(t2);
        assert(result == "Buzz");
    }

    @Test
    void fizz_buzz_test(){
        result = fiz.check(t3);
        assert(result == "FizzBuzz");
    }

    @Test
    void not_dividable(){
        result = fiz.check(t4);
        assert(result == String.valueOf(t4));
    }



}
