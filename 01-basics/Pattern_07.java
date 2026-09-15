public class Pattern_07{
    public static void main(String[] args) {
        printPattern(4);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1 ; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}