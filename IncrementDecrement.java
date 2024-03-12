public class IncrementDecrement {
    
    public static int increment(int num) {
        return num + 1;
    }
    
    public static int decrement(int num) {
        return num - 1;
    }

    public static void main(String[] args) {
        int number = 5;
        
        // Increment operation....
        System.out.println("Original number: " + number);
        number = increment(number);
        System.out.println("After increment: " + number);  // Output: 6
        
        // Decrement operation...
        System.out.println("Original number: " + number);
        number = decrement(number);
        System.out.println("After decrement: " + number);  // Output: 5
    }
}
