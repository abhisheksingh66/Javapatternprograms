public class ReverseFloydTriangle {
    public static void main(String[] args) {
        int n = 4;
        int num = 10;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print(num + " ");
                num--;
            }

            System.out.println();
        }
    }
}

