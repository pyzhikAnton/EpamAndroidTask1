package by.dm.firstapp;

/**The class find and hold full list of prime numbers
 * from 2 to some number{maxValue as a parameter when
 * you create an object of the class}.
 *
 * Created by AntonPyzhyk on 12.03.2018.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PrimeNumbers {

    private ArrayList <Integer> primeNumbers;

    public PrimeNumbers (int maxValue){
        createPrimeNumberList();
        fillPrimeNumberList(maxValue);
    }

    private void createPrimeNumberList() {
        primeNumbers = new ArrayList<Integer>();
        primeNumbers.addAll(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
    }

    private void fillPrimeNumberList(int max) {
        for (int i = 23; i < max; i += 2) {
            if (isPrimeNumber(i)) {
                primeNumbers.add(i);
            }
        }
    }

    private boolean isPrimeNumber(int number) {
        Iterator<Integer> iter = primeNumbers.iterator();
        int a;
        while (iter.hasNext() && ((a = iter.next()) <= Math.ceil(Math.sqrt(number)))) {
            if (number % a == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getPrimeNumbers() {
        return primeNumbers;
    }
}
