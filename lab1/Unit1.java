class  Clause1_1 {
    public static void main(String[] args) {
        System.out.println("Welcome to OOP Programming");
    }
}

class Clause1_2 {
    public static void main(String[] args) {
        short defaultShort = 42;
        int defaultInt = 12345;
        long defaultLong = 9876543210L;
        float defaultFloat = 3.14f;
        double defaultDouble = 2.71828;
        char defaultChar = 'A';
        String defaultString = "Hello, World!";
        boolean defaultBoolean = true;

        System.out.println("Default values of primitive data types:");
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: " + defaultChar);
        System.out.println("String: " + defaultString);
        System.out.println("boolean: " + defaultBoolean);
    }
}

class Clause1_3 {
    public static void main(String[] args) {
        String str1 = "OOP";
        String str2 = "Object-Oriented Programming";
        if (str1.equals(str2)) {
            System.out.println("str1 is equal to str2");
        } else {
            System.out.println("str1 is not equal to str2");
        }
    }
}

public class Unit1 {
    public static void main(String[] args) {
        System.out.println("Unit 1: Introduction to Java");
        System.out.println("1 Clause");
        Clause1_1.main(args);
        System.out.println();

        System.out.println("2 Clause");
        Clause1_2.main(args);
        System.out.println();

        System.out.println("3 Clause");
        Clause1_3.main(args);
        System.out.println();
    }
}
