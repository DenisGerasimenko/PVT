package lesson10;

import java.util.ArrayList;
import java.util.HashSet;

public class Task27 {
    public static void main(String[] args) {
        int element = 5;
        int negative = 3;
        ArrayList<Integer> mark = new ArrayList<Integer>();

        for (int i = 0; i < element; i++) {
            int a = (int) (Math.random() * 10 + 1);
            mark.add(a);
        }
        System.out.println(mark);

        ArrayList<Integer> negativeList = new ArrayList<Integer>();
        for (int i = 0; i < element; i++) {
            int k = mark.get(i);
            if (k <= negative) {
                negativeList.add(k);
            }
        }
        mark.removeAll(negativeList);
        System.out.println(mark);
    }
}

