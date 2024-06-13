import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FizzBuzzTest {
    private int t1;
    private int t2;
    private int t3;
    private FizzBuzz fiz;
    private int resultNum;
    private String resultStr;


    @BeforeEach
    void setUp(){
        this.fiz = new FizzBuzz();
        this.resultNum = 0;
        this.resultStr = "";
        this.t1 = 3;
        this.t2 = 5;
        this.t3 = 15;
    }

    @AfterEach
    void tearDown(){

    }

    @Test
    void fizz_test(){
        resultStr = fiz.check(t1);
        assert(resultStr == "Fizz");




    }

    @Test
    void buzz_test(){

    }

    @Test
    void fizz_buzz_test(){

    }

}
