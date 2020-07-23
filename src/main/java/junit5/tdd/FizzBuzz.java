package junit5.tdd;

public class FizzBuzz {
    public String play(int number){
        if(number % 3 == 0){
            return "Fizz";
        }
        else if(number % 5 ==0){
            return "Buzz";
        }
        else if(number % 7 ==0){
            return "Whizz";
        }
        return String.valueOf(number);
    }
}
