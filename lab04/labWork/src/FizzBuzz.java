public class FizzBuzz {

    private String result;
    public FizzBuzz() {
        this.result = "";
    }

    public String check(int num) {
        if (num % 3 == 0){
            result = "Fizz";
        }
        return result;
    }
}
