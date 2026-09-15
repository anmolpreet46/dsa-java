public class Pattern_06{
    public static void main(String[] args) {
        printPattern(4);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i ; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}