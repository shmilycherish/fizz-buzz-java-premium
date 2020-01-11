package com.thoughtworks;

public class FizzBuzz {
    public String execute(int number) {
        String numberAsStr = String.valueOf(number);
        String result = beDivideByThreeRule(number) + beDivideByFiveRule(number) + beDivideBySevenRule(number);
        if (numberAsStr.contains("5")) {
            result = result.replace("Fizz", "");
        } else if (numberAsStr.contains("3")) {
            result = "Fizz";
        }

        return result.equals("") ? numberAsStr : result;
    }

    private boolean beDivideBy(int number, int divisor) {
        return number % divisor == 0;
    }

    private String beDivideByThreeRule(int number) {
        return beDivideBy(number, 3) ? "Fizz" : "";
    }

    private String beDivideByFiveRule(int number) {
        return beDivideBy(number, 5) ? "Buzz" : "";
    }

    private String beDivideBySevenRule(int number) {
        return beDivideBy(number, 7) ? "Whizz" : "";
    }
}
