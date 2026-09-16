public class Pattern_14{
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        char c = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j ++)
                System.out.print((char) (c + j));
            System.out.println();
        }
    }
}