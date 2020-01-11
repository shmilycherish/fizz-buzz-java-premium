package com.thoughtworks;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTEST {
    @Test
    public void shouldReturnNumberItself() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.execute(1), is("1"));
        assertThat(fizzBuzz.execute(11), is("11"));
    }

    @Test
    public void shouldReturnFizzWhenNumberCouldBeDivideBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.execute(3), is("Fizz"));
        assertThat(fizzBuzz.execute(12), is("Fizz"));
    }

    @Test
    public void shouldReturnBuzzWhenNumberCouldBeDivideBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.execute(5), is("Buzz"));
        assertThat(fizzBuzz.execute(20), is("Buzz"));
    }

    @Test
    public void shouldReturnWhizzWhenNumberCouldBeDivideBy7() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.execute(7), is("Whizz"));
        assertThat(fizzBuzz.execute(14), is("Whizz"));
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberCouldBeDivideBy3And5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.execute(60), is("FizzBuzz"));
        assertThat(fizzBuzz.execute(90), is("FizzBuzz"));
    }

    @Test
    public void shouldReturnFizzWhizzWhenNumberCouldBeDivideBy3And7() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.execute(21), is("FizzWhizz"));
        assertThat(fizzBuzz.execute(42), is("FizzWhizz"));
    }

    @Test
    public void shouldReturnFizzWhenNumberContains3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.execute(13), is("Fizz"));
        assertThat(fizzBuzz.execute(30), is("Fizz"));
        assertThat(fizzBuzz.execute(630), is("Fizz"));
    }

    @Test
    public void shouldResultNotContainsFizzReturnWhenNumberContains5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.execute(35), is("BuzzWhizz"));
        assertThat(fizzBuzz.execute(3150), is("BuzzWhizz"));
        assertThat(fizzBuzz.execute(75), is("Buzz"));
    }
}
