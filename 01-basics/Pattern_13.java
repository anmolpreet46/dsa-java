public class Pattern_13{
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j ++, x++)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}