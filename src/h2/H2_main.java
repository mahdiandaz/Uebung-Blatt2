package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 7;
        int j = 3;
        int k = 11;

        int min = i;
        if (j < min) min = j;
        if (k < min) min = k;

        int max = i;
        if (j > max) max = j;
        if (k > max) max = k;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
