public class FizzBuzz {

    public String execute(int[] numbers) {
        String[] processedNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            processedNumbers[i] = processNumber(numbers[i]);
        }
        return String.join(", ", processedNumbers);
    }

    String processNumber(int number) {
        if (isMultipleOf3(number) && isMultipleOf5(number)) {
            return "FizzBuzz";
        }

        if (isMultipleOf3(number)) {
            return "Fizz";
        }

        if (isMultipleOf5(number)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }
}
