public class CounterDemo {
    public static void main(String[] args) {
        // i++ returns old value, then increments
        int x = 5;
        System.out.println("i++:  int result = x++; where x = 5");
        System.out.println("result = " + x++ + ", x is now " + x);
        
        // ++i increments first, then returns new value
        int y = 5;
        System.out.println("\n++i:  int result = ++y; where y = 5");
        System.out.println("result = " + ++y + ", y is now " + y);
    }
}

