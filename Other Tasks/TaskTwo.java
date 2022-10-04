package MasterCardAssessment;

public class TaskTwo {


    // public static void main(String[] args) {
    //     String test1 = "Read this string backwards";
    // //    String test2 = "sdrawkcab gnirts siht daeR";
    //     System.out.println("The reversed string is: " + reverseStringRecursive(test1));
    //     System.out.println("The reversed string is: " + reverseStringIterative(reverseStringRecursive(test1)));
    // }

    // Recurisive method to reverse a string
    static String reverseStringRecursive(String test) {
        if (test.isEmpty())
            return "";

    //    System.out.println(test);
        return reverseStringRecursive(test.substring(1)) + test.charAt(0);
    }

    // Iterative method to reverse a string
    static String reverseStringIterative(String test) {
        if (test.isEmpty())
            return "";
        String reversed = "";
        for (int i = test.length() - 1; i >= 0; i--) 
            reversed += test.charAt(i);
        
        return reversed;
    }

}
