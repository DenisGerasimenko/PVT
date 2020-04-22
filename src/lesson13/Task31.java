package lesson13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task31 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList <Integer>();

        while (true) {

            try {

                String currentToken = in.next();
                numbers.add(Integer.parseInt(currentToken));

            }
            catch (NoSuchElementException e) {
                break;
            }
            catch (NumberFormatException e) {
                continue;
            }

        }

        int sum = 0;
        System.out.println("Числа в тексте:");
        for (Integer element: numbers) {
            System.out.print(element + " ");
            sum += element;
        }

        System.out.println();
        System.out.println("Сумма элементов: " + sum);

        ArrayList <Integer> numbersNoRepeat = new ArrayList<Integer>();
        HashSet <Integer> alreadyMet = new HashSet<Integer>();

        for (Integer element: numbers) {
            if (!alreadyMet.contains(element)) {
                numbersNoRepeat.add(element);
                alreadyMet.add(element);
            }
        }

        
        System.out.println("Числа в тексте без повторений:");
        for (Integer element: numbersNoRepeat) {
            System.out.print(element + " ");
            sum += element;
        }
    }
}