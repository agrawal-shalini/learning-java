package datastructure.basic_datatypes;

/**
 * @author Shalini Agrawal
 * @since 20-03-2021
 * Integer can be of 2 types
 * <br> Primitive int
 * <br>     equality is checked by ==
 * <br> Wrapper classes
 * <br>        Wrapper classes shares memory in between -127 to 127
 */
public class IntegerUtil {

    public static boolean checkWithDoubleEquals(int a, int b) {
        return a == b;
    }
    public static boolean checkWithDoubleEquals(Integer a, Integer b) {
        return a == b;
    }

    public static boolean checkWithEquals(Integer val1, Integer val2) {
        return val1.equals(val2);
    }
}
