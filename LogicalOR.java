
 public class LogicalOR {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = -5;
        
        if (num1 > 0 || num2 > 0) {
            System.out.println("At least one number is positive.");
        } else {
            System.out.println("Both numbers are not positive.");
        }
    }
}
 /*
  * public class LogicalNOT{
    public static void main(String[] args) {
        boolean isTrue = false;
        
        
        if (!isTrue) {
            System.out.println("The boolean variable is not true.");
        } else {
            System.out.println("The boolean variable is true.");
        }
    }
}
  */
