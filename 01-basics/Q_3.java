public class Q_3 {
    static void re(int x){
        if(x <= 0)
            return;
        System.out.println(x);
        re(x - 1);
    }
    public static void main(String[] args) {
        re(5);
    }
}
