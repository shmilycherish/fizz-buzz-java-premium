package com.thoughtworks;

public class FizzBuzz {
    public String execute(int number) {
        if (beDivideBy(number, 3)) {
            return "Fizz";
        }

        if (beDivideBy(number, 5)) {
            return "Buzz";
        }

        return beDivideBy(number, 7) ? "Whizz" : String.valueOf(number);
    }

    private boolean beDivideBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
