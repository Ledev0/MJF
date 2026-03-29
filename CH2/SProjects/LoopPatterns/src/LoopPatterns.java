public class LoopPatterns {
    public static void main(String[] args) {

        // Pattern 1: Right-angled triangle
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        } // نهاية Pattern 1

        System.out.println("================================");

        // Pattern 2: Inverted right-angled triangle
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}