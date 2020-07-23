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
    void should_return_Fizz_when_play_fizzBuzz_given_3() {
        //given
        int number = 3;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_play_fizzBuzz_given_5() {
        //given
        int number = 5;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_Whizz_when_play_fizzBuzz_given_7() {
        //given
        int number = 7;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_FizzBuzz_when_play_fizzBuzz_given_15() {
        //given
        int number = 15;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_FizzWhizz_when_play_fizzBuzz_given_21() {
        //given
        int number = 21;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("FizzWhizz", actual);
    }

    @Test
    void should_return_BuzzWhizz_when_play_fizzBuzz_given_35() {
        //given
        int number = 35;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_play_fizzBuzz_given_105() {
        //given
        int number = 105;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("FizzBuzzWhizz", actual);
    }
}
