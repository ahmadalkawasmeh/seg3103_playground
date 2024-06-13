public class FizzBuzz {

    private String result;

    // Constructor sets result to empty string
    public FizzBuzz() {
        this.result = "";
    }


    // For checking an integer
    public String check(int num) {
        if (isFizzBuzz(num)){
            return "FizzBuzz";
        }

        if (isFizz(num)){
            return "Fizz";
        }

        if (isBuzz(num)){
            return "Buzz";
        }

        return String.valueOf(num);
    }


    // For checking an integer passed in as a string
    public String check(String numStr) {
        int numStrToInt = Integer.parseInt(numStr); // Convert to integer

        result = check(numStrToInt); // Delegate back to normal check

        return result;
    }


    private boolean isFizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0){
            return true;
        }

        return false;
    }


    private boolean isFizz(int n) {
        if (n % 3 == 0){
            return true;
        }
        return false;
    }


    private boolean isBuzz(int n) {
        if (n % 5 == 0){
            return true;
        }
        return false;
    }
}
