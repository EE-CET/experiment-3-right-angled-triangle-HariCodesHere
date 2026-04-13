public class Triangle {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                if (j < i - 1) {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
