package lesson10;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Task29 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();
        int currentChar;
        String currentWord = "";
        InputStreamReader is = new InputStreamReader(System.in);
        while ((currentChar = is.read()) !=-1)  {

            if (Character.isLetter(currentChar)) {

                currentWord = currentWord + (char) currentChar;

            } else if (currentWord != "") {

                if (dictionary.containsKey(currentWord))
                    dictionary.put(currentWord, dictionary.get(currentWord) + 1);
                else
                    dictionary.put(currentWord, 1);
                currentWord = "";
            }

        }
        if (currentWord != "") {

            if (dictionary.containsKey(currentWord))
                dictionary.put(currentWord, dictionary.get(currentWord) + 1);
            else
                dictionary.put(currentWord, 1);
        }
        for (HashMap.Entry el : dictionary.entrySet()) {
            String key = (String) el.getKey();
            int value = (int) el.getValue();
            System.out.println(key + " " + value);
        }

    }
}




