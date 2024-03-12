
 public class SmallerLargerNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        
        int smallerNumber = (num1 < num2) ? num1 : num2;
        
        int largerNumber = (num1 > num2) ? num1 : num2;
        
        System.out.println("Smaller number: " + smallerNumber);
        System.out.println("Larger number: " + largerNumber);
    }
}

