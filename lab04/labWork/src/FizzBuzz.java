public class FizzBuzz {

    private String result;
    // Constructor sets result to empty string
    public FizzBuzz() {
        this.result = "";
    }

    public String check(int num) {
        if (num % 3 == 0){
            result = "Fizz";
        }
        else {
            result = String.valueOf(num);
        }
        return result;
    }
}
