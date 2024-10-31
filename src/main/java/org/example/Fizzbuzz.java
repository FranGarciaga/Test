package org.example;

public class Fizzbuzz {
    public String checkNumber(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }

    }
}
