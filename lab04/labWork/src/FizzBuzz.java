public class FizzBuzz {

    private String result;
    // Constructor sets result to empty string
    public FizzBuzz() {
        this.result = "";
    }

    public String check(int num) {
        if (num % 3 == 0 && num % 5 == 0){
            result = "FizzBuzz";
            return result;
        }

        if (num % 3 == 0){
            result = "Fizz";
            return result;
        }

        if (num % 5 == 0){
            result = "Buzz";
            return result;
        }

        if (result.isEmpty()){
            result = String.valueOf(num);
            return result;
        }
        return result;
    }
}
