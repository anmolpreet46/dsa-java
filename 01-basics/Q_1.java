public class Q_1 {
    static void re(int x, String s){
        if(x <= 0)
            return;
        System.out.println(s);
        re(x - 1, s);
    }
    public static void main(String[] args) {
        re(5,"Recursion");
    }
}
