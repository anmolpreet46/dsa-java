public class Pattern_16{
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j ++)
                System.out.print((char) ('A' + i));
            System.out.println();
        }
    }
}