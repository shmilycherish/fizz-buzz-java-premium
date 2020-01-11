package com.thoughtworks;

public class FizzBuzz {
    public String execute(int number) {
        if (beDivideBy(number, 3)) {
            return "Fizz";
        }
        return beDivideBy(number, 5) ? "Buzz" : String.valueOf(number);
    }

    private boolean beDivideBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
