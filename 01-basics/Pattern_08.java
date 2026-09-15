public class Pattern_08{
    public static void main(String[] args) {
        printPattern(4);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < (n - i) * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}