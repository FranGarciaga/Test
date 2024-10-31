import org.example.Fizzbuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Test si el numero es divisible por 3")
    void test_whenTheNumberIsDivisibleByThree_returnFizz() {
        //Given
        Fizzbuzz objectOfFizzbuzz = new Fizzbuzz();
        //When
        String result = objectOfFizzbuzz.checkNumber(9);
        //Then
        assertEquals("Fizz", result);
    }


    @Test
    @DisplayName("Test si el numero es divisible por 5")
    void test_whenTheNumberIsDivisibleByFive_returnBuzz() {
        //Given
        Fizzbuzz objectOfFizzbuzz = new Fizzbuzz();
        //When
        String result = objectOfFizzbuzz.checkNumber(10);
        //Then
        assertEquals("Buzz", result);
    }

    @Test
    @DisplayName("Test si el numero es divisible por 5 y por 3")
    void test_whenTheNumberIsDivisibleByFiveAndThree_returnFizzBuzz() {
        //Given
        Fizzbuzz objectOfFizzbuzz = new Fizzbuzz();
        //When
        String result = objectOfFizzbuzz.checkNumber(30);
        //Then
        assertEquals("FizzBuzz", result);
    }

    @Test
    @DisplayName("Test si el numero NO es divisible ni por 5 ni por 3")
    void test_whenTheNumberIsNotDivisibleByFiveAndThree_returnTheNumber() {
        //Given
        Fizzbuzz objectOfFizzbuzz = new Fizzbuzz();
        //When
        String result = objectOfFizzbuzz.checkNumber(13);

    }
}