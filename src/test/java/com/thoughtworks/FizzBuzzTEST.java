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
}
