package lesson11;

import java.util.ArrayList;
import java.util.Iterator;

class Тask28 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        int studentsNumber = 25;
        for (int i = 0; i < studentsNumber; i++)
            a.add(1 + (int) Math.round(Math.random() * 9));
        System.out.println(("Оценки: "));
        Iterator<Integer> it = a.iterator();
        while (it.hasNext())
            System.out.println(it.next() + " ");
        System.out.println();
        System.out.println("Самая высокая оценка: ");
        int highestMark = 0;
        it = a.iterator();
        while (it.hasNext())
            highestMark = Math.max(it.next(), highestMark);
        System.out.println(highestMark);

    }
}