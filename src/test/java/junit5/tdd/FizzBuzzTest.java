package junit5.tdd;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_play_fizzBuzz_given_1() {
        //given
        int number = 1;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("1", actual);
    }

    @Test
    void should_return_3_when_play_fizzBuzz_given_3() {
        //given
        int number = 3;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_5_when_play_fizzBuzz_given_5() {
        //given
        int number = 5;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("Buzz", actual);
    }
}
