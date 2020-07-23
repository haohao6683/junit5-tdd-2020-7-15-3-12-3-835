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
        String actual = fizz.judge(number);

        //then
        assertEquals("1", actual);
    }

    @Test
    void should_return_Fizz_when_play_fizzBuzz_given_3() {
        //given
        int number = 3;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.judge(number);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_play_fizzBuzz_given_5() {
        //given
        int number = 5;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.judge(number);

        //then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_Whizz_when_play_fizzBuzz_given_7() {
        //given
        int number = 7;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.judge(number);

        //then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_FizzBuzz_when_play_fizzBuzz_given_15() {
        //given
        int number = 15;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.judge(number);

        //then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_FizzWhizz_when_play_fizzBuzz_given_21() {
        //given
        int number = 21;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.judge(number);

        //then
        assertEquals("FizzWhizz", actual);
    }

    @Test
    void should_return_BuzzWhizz_when_play_fizzBuzz_given_35() {
        //given
        int number = 35;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.judge(number);

        //then
        assertEquals("BuzzWhizz", actual);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_play_fizzBuzz_given_105() {
        //given
        int number = 105;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.judge(number);

        //then
        assertEquals("FizzBuzzWhizz", actual);
    }

    @Test
    void should_return_ALongString_when_play_fizzBuzz_given_120() {
        //given
        int number = 120;

        //when
        FizzBuzz fizz = new FizzBuzz();
        String actual = fizz.play(number);

        //then
        assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "Whizz\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "Whizz\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n" +
                "FizzWhizz\n" +
                "22\n" +
                "23\n" +
                "Fizz\n" +
                "Buzz\n" +
                "26\n" +
                "Fizz\n" +
                "Whizz\n" +
                "29\n" +
                "FizzBuzz\n" +
                "31\n" +
                "32\n" +
                "Fizz\n" +
                "34\n" +
                "BuzzWhizz\n" +
                "Fizz\n" +
                "37\n" +
                "38\n" +
                "Fizz\n" +
                "Buzz\n" +
                "41\n" +
                "FizzWhizz\n" +
                "43\n" +
                "44\n" +
                "FizzBuzz\n" +
                "46\n" +
                "47\n" +
                "Fizz\n" +
                "Whizz\n" +
                "Buzz\n" +
                "Fizz\n" +
                "52\n" +
                "53\n" +
                "Fizz\n" +
                "Buzz\n" +
                "Whizz\n" +
                "Fizz\n" +
                "58\n" +
                "59\n" +
                "FizzBuzz\n" +
                "61\n" +
                "62\n" +
                "FizzWhizz\n" +
                "64\n" +
                "Buzz\n" +
                "Fizz\n" +
                "67\n" +
                "68\n" +
                "Fizz\n" +
                "BuzzWhizz\n" +
                "71\n" +
                "Fizz\n" +
                "73\n" +
                "74\n" +
                "FizzBuzz\n" +
                "76\n" +
                "Whizz\n" +
                "Fizz\n" +
                "79\n" +
                "Buzz\n" +
                "Fizz\n" +
                "82\n" +
                "83\n" +
                "FizzWhizz\n" +
                "Buzz\n" +
                "86\n" +
                "Fizz\n" +
                "88\n" +
                "89\n" +
                "FizzBuzz\n" +
                "Whizz\n" +
                "92\n" +
                "Fizz\n" +
                "94\n" +
                "Buzz\n" +
                "Fizz\n" +
                "97\n" +
                "Whizz\n" +
                "Fizz\n" +
                "Buzz\n" +
                "101\n" +
                "Fizz\n" +
                "103\n" +
                "104\n" +
                "FizzBuzzWhizz\n" +
                "106\n" +
                "107\n" +
                "Fizz\n" +
                "109\n" +
                "Buzz\n" +
                "Fizz\n" +
                "Whizz\n" +
                "113\n" +
                "Fizz\n" +
                "Buzz\n" +
                "116\n" +
                "Fizz\n" +
                "118\n" +
                "Whizz\n" +
                "FizzBuzz\n", actual);
    }
}
