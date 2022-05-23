package Bootcamp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete la siguiente función para que la misma devuelva todos los números
     * de 4 dígitos, donde cada uno sea menor o igual a <maxDigit> 
     * y la suma de como resultado 21, en honor a este año.
     * Ejemplos con maxDigit=6: 3666, 4566
     *
     * En caso de no encontrar ninguno devolver null.
     */
    public static List<Integer> calculation(int maxDigit) {

        List<Integer> numbers = new ArrayList<>();

        int sum = 21;
        int maxNumber = maxDigit * 1111;


        for (int number = 1000; number <= maxNumber; number++) {
            int firstNumber = number / 1000;
            int secondNumber = (number / 100) % 10;
            int thirdNumber = (number / 10) % 10;
            int fourthNumber = number % 10;

            if(secondNumber > maxDigit || thirdNumber > maxDigit || fourthNumber > maxDigit){
                continue;
            }

            if (firstNumber + secondNumber + thirdNumber + fourthNumber == sum) {
                numbers.add(number);
            }
        }

        return numbers.isEmpty() ? null : numbers;

    }

}


