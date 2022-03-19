package datastructure.basic_datatypes;

import java.util.Objects;

public class StringUtil {
    public static boolean isEqual(String s1, String s2) {
        return s1 == s2;
    }

    public static boolean isEquals(String s1, String s2) {
        return Objects.equals(s1, s2);
    }
    public static boolean isEqualsIgnoreCase(String a, String b) {
        return (a == b) || (a != null && a.equalsIgnoreCase(b));
    }
}
