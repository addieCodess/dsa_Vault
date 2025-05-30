import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dna = sc.nextLine();
        System.out.print(maxRep(dna));
        sc.close();
    }

    static int maxRep(String dna) {
        if (dna == null || dna.length() == 0) return 0;

        char rep = dna.charAt(0);
        int max = 1;
        int count = 1;

        for (int i = 1; i < dna.length(); i++) {
            char now = dna.charAt(i);
            if (now == rep) {
                count++;
            } else {
                max = Math.max(max, count);
                rep = now;
                count = 1;
            }
        }

        max = Math.max(max, count);
        return max;
    }
}
