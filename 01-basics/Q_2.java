public class Q_2 {
    static void re(int x){
        if(x <= 0)
            return;
        re(x - 1);
        System.out.println(x);
    }
    public static void main(String[] args) {
        re(5);
    }
}
