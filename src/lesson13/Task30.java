package lesson13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task30 {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in); // сканер для ввода
        ArrayList <Integer> numbers = new ArrayList <Integer>(); // массив, где будут числа

        while (true) { // "бесконечный" цикл

            try {

                String currentToken = in.next(); // пытаемся ввести следующий токен (слово или число, отделенные пробелами)
                numbers.add(Integer.parseInt(currentToken)); // и преобразовать его в число и положить в конец массива чисел

            }
            catch (NoSuchElementException e) { // если ввод закончился
                break;	// то заканчиваем наш цикл ввода
            }
            catch (NumberFormatException e) { // если это слово, а не число (ошибка преобразования в число)
                continue; // переходим к следующему
            }

        }

        int sum = 0; // переменная суммы чисел
        System.out.println("Числа в тексте:");
        for (Integer element: numbers) { // перебираем все числа
            System.out.print(element + " "); // выводим
            sum += element; // прибавляем к сумме
        }

        System.out.println();
        System.out.println("Сумма элементов: " + sum); // выводим сумму

        ArrayList <Integer> numbersNoRepeat = new ArrayList<Integer>(); // массив, где будут числа без повторений
        HashSet <Integer> alreadyMet = new HashSet<Integer>(); // set, с помощью которого мы будем проверять, встречали ли мы такое число

        for (Integer element: numbers) { // перебираем числа
            if (!alreadyMet.contains(element)) { // если мы еще НЕ встречали такое
                numbersNoRepeat.add(element); // обавляем в массив без повторений
                alreadyMet.add(element); // и добавляем в set
            }
        }

        // выводим
        System.out.println("Числа в тексте без повторений:");
        for (Integer element: numbersNoRepeat) {
            System.out.print(element + " ");
            sum += element;
        }
    }
}