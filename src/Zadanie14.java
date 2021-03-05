import java.util.Arrays;

public class Zd14 {
    public static void main(String[] args) {
        int[] marks = new int[20];
        int maxMark = marks [0];
        int maxIndex= 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i]=(int)(Math.random()*10+1); {
                System.out.println("Ученик"+i+"="+marks[i]);
            }
            int score = marks [i];
            if (maxMark < score) {
                maxMark = score;
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);
    }
}
