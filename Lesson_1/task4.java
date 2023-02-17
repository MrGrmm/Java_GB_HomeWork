package Lesson_1;

public class task4 {
    public static void main(String[] args) {
        int q = 0;
        int w = 0;
        int e = 69;

        for (int i = 20; i <= 29; i++) {
            for (int j = 0; j <= 69; j++) {
                if (i + (j + 5) == e) {
                    q = i;
                    w = j;
                }
            }
        }

        System.out.println(q + " + " + w + " = " + e); 
    }
}
