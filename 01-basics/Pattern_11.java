public class Pattern_11{
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            int x = (i + 1) % 2 ;
            for(int j = 0; j <= i ; j ++, x++)
                System.out.print(x%2);
            System.out.println();
        }
    }
}