public class Pattern_18 {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j ++)
                System.out.print((char)('A' + n - i + j - 1));
            System.out.println();
        }
    }
}