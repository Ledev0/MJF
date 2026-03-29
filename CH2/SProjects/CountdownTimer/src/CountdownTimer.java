public class CountdownTimer {
    public static void main(String[] args) {
        int x = 10;

        while( x > 0 ) {
            System.out.println("Tick :  " + x);
            x--;
        }
        System.out.println("BOOM!");
    }
}
