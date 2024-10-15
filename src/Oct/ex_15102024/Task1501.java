package Oct.ex_15102024;

public class Task1501 {

    public static void main(String[] args) {
        int a = 36;
        int b = 108;
        int c = 93;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println(max);
    }
}
