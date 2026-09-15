class Pattern_01 {
    public void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}