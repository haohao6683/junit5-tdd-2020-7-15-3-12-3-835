package junit5.tdd;

import org.junit.jupiter.api.Test;

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
}
