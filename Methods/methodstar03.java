public class methodstar03 {

    static int star(int a) {
        for (int i = 0; i <= a; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
        }
        return a;
    }

    public static void main(String[] args) {
        star(3);

    }
}
