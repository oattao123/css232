public class OperatorsTest {
    public static void main (String[] args) {
        int a = 9;
        int b = 9;
        int result_add = a + b;
        System.out.println("Addition Result = " + result_add);
        ++result_add;
        System.out.println("Increment Result of addition = " + result_add);
        double result_mod = result_add % b;
        System.out.println("Modulus Result = " + result_mod);
        a += 5;
        System.out.println("Result of variable a = " + a);
        System.out.println("Bitwise of 2|1 = " + (2|1));
        boolean compare_ab = (a == b);
        System.out.println("Compare a and b = " + compare_ab);
        boolean logical_ab = (a<5 && b>8);
        System.out.println("logical a and b = " + logical_ab);

    }
}
