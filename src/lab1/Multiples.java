package lab1;

public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int cnt = 0;
        while (i < 1000) {
            Boolean divisibleBy3 = i % 3 == 0;
            Boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                cnt ++;
            }

            i++;
        }

        System.out.println(cnt);
    }
}
