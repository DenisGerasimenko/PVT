public class Zd15 {
    public static void main(String[] args) {
        int z = 0;
        int marks[] = new int[20];
        int maxMark = marks[0];
        int minMark = marks[0];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10);
            System.out.print(marks[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > maxMark) {
                maxMark = marks[i];
            }
            if (marks[i] < minMark) {
                minMark = marks[i];
            }
        }
        System.out.println(minMark + " " + maxMark);
        if (minMark < maxMark) {
            for (int i = minMark + 1; i < maxMark; i++)
                z += marks[i];
        } else if (minMark > maxMark) ;
        {
            for (int i = maxMark + 1; i < minMark; i++)
                z += marks[i];
        }
        System.out.println(z);

    }
}