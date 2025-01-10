/**
 * A class to demonstrate the eight primitive types in Java.
 *
 * Definitions are taken from: <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">Java Tutorials</a>
 *
 */
public class PrimitiveTypesDemo {

    public static void main(String[] args) {

        String separator = "*******************************";
        System.out.format("PrimitiveTypesDemo\n%s\n\n", separator);

        // byte: 8-bit signed two's complement integer; min value of -128 and
        // max value of 127

        // short: 16-bit signed two's complement integer; min value of -32,768 and max value of 32,767

        // int: 32-bit signed two's complement integer; min value of -2^31 and max value of 2^31-1
        int x = 5;
        System.out.println(x++);
//        --x;
//        ++x;
//        x--;

        // long: 64-bit two's complement integer; min value of -2^63 and max value of 2^63-1
        long y = 5;

        // float: single-precision 32-bit IEEE 754 floating point
        float f = 5.0f;

        // double: double-precision 64-bit IEEE 754 floating point
        double d = 5.0;

        // boolean: true or false
        boolean b = true;

        // char: 16-bit Unicode characters
        char c = 'A';

        String className = "CS 5004";
        int result = className.length();
        System.out.println("length: " + result);


    }


}

