
public class J44ExeptionHandling {
    public static void main(String args[]) {
        int i = 0;
        int j = 0;

        int nums[] = new int[5];

        try {
            // j = 18 / 0;
            System.out.println(nums[1]);
            System.out.println(nums[5]); // 6 th element is not present going out of bound
        } catch (Exception e) { // catch block executes only whem the exception found
            System.out.println("Someting Went wrong  " + e);
        }
        // System.out.println(j);
        System.out.println("Bye");

        /* for  j = 18 / 0;
         * Someting Went wrong java.lang.ArithmeticException: / by zero
         * 0
         * Bye
         */

        /*
         * 0
         * Someting Went wrong java.lang.ArrayIndexOutOfBoundsException: 5
         * Bye
         */
    }
}
