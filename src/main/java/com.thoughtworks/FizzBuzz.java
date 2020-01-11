package com.thoughtworks;

public class FizzBuzz {
    public String execute(int number) {
        String result = "";
        if (beDivideBy(number, 3)) {
            result += "Fizz";
        }

        if (beDivideBy(number, 5)) {
            result += "Buzz";
        }

        if (beDivideBy(number, 7)) {
            result += "Whizz";
        }

        return result.equals("") ? String.valueOf(number) : result;
    }

    private boolean beDivideBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
