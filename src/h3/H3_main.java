package h3;

public class H3_main {
    public static void main(String[] args) {
        int i = 4;
        int j = 7;
        int k = -10;

        if (i > 0 && j > 0) {
            k = 1;
        } else if (i > 0 && j < 0) {
            k = 2;
        } else if (i < 0 && j > 0) {
            k = 3;
        } else {
            k = 4;
        }

        System.out.println("k = " + k);
    }
}
