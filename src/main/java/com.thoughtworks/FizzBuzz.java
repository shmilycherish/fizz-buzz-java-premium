package com.thoughtworks;

public class FizzBuzz {
    public String execute(int number) {
        return number % 3 ==0 ? "Fizz" : String.valueOf(number);
    }
}
