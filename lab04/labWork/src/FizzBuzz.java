public class FizzBuzz {

    private String result;
    // Constructor sets result to empty string
    public FizzBuzz() {
        this.result = "";
    }

    // Fro checking an integer
    public String check(int num) {
        if (isFizzBuzz(num)) return result;

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

    // For checking an integer passed in as a string
    public String check(String numStr) {
        int numStrToInt = Integer.parseInt(numStr);

        if (isFizzBuzz(numStrToInt)){
            return "FizzBuzz";
        }

        if (numStrToInt % 3 == 0){
            result = "Fizz";
            return result;
        }

        if (numStrToInt % 5 == 0){
            result = "Buzz";
            return result;
        }

        return result;
    }

    private boolean isFizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0){
            result = "FizzBuzz";
            return true;
        }
        return false;
    }


}
