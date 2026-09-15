public class Pattern_01{
    public static void main(String[] args) {
        printPattern(4);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}