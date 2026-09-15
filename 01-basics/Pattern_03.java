public class Pattern_03{
    public static void main(String[] args) {
        printPattern(4);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}