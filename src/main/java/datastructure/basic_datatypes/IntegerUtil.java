package datastructure.basic_datatypes;

/**
 * Integer can be of 2 types
 * <br> Primitive int
 * <br> Wrapper classes
 * <br>        Wrapper classes shares memory in between -128 to 127
 */
public class IntegerUtil {

    public static boolean isEqual(int a, int b) {
        return a == b;
    }
    public static boolean isEqual(Integer a, Integer b) {
        return a == b;
    }

    public static boolean checkWithEquals(Integer val1, Integer val2) {
        return val1.equals(val2);
    }
}
