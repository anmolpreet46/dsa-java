public class Pattern_22{
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int i = 0; i < ( 2 * n ) - 1 ; i++) {
            for (int j = 0; j < ( 2 * n ) - 1; j++){
                int x = Math.min(i , j);
                int y = Math.min((2 * n - 1 ) - i - 1, (2 * n - 1) - j - 1);
                int z = Math.min(x, y);
                System.out.print(n - z);
            }
            System.out.println();
        }
    }
}