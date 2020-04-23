package lesson13;


import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Task30 {


    public static void main(String[] args) throws java.lang.Exception {
        String currentWord = "";
        InputStreamReader is = new InputStreamReader(new FileInputStream("D:\\Стих.txt"));

        int currentChar;
        int numberWords = 0, numberPunct = 0;

        while ((currentChar = is.read()) != -1) {

            if (Character.isLetter(currentChar)) {

                currentWord = currentWord + (char) currentChar;

            } else if (currentWord != "") {
                numberWords++;

                currentWord = "";
            }

            if (currentChar == '?' || currentChar == '.' || currentChar == '-' ||
                    currentChar == ',' || currentChar == ':' || currentChar == ';' ||
                    currentChar == '—' || currentChar == '!')
                numberPunct++;

        }


        if (currentWord != "") {

            numberWords++;
        }

        System.out.println("Количество слов: " + numberWords);
        System.out.println("Количество знаков препинания: " + numberPunct);

    }
}
