package datastructure.basic_datatypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    void whenStringLiteralComparisonWithDoubleEqualsAndSameValueThenReturnTrue() {
        var isEquals = StringUtil.isEqual("shalu", "shalu");
        Assertions.assertTrue(isEquals);
    }

    @Test
    void whenStringLiteralComparisonWithDoubleEqualsAndDifferentValueThenReturnFalse() {
        var isEquals = StringUtil.isEqual("shalu", "alu");
        Assertions.assertFalse(isEquals);
    }

    @Test
    void whenStringLiteralComparisonWithDoubleEqualsAndNullValueThenReturnFalse() {
        var isEquals = StringUtil.isEqual(null, "alu");
        Assertions.assertFalse(isEquals);
    }

    @Test
    void whenStringLiteralComparisonWithDoubleEqualsAndBothNullValueThenReturnTrue() {
        var isEquals = StringUtil.isEqual(null, null);
        Assertions.assertTrue(isEquals);
    }

    @Test
    void whenStringInstanceComparisonWithDoubleEqualsAndSameValueThenReturnFalse() {
        var val1 = new String("shalu");
        var val2 = new String("shalu");
        var isEquals = StringUtil.isEqual(val1, val2);
        Assertions.assertFalse(isEquals);
    }

    @Test
    void whenStringInstanceComparisonWithDoubleEqualsAndSameValueWithInterningThenReturnFalse() {

        var val1 = new String("shalu");
        var val2 = val1.intern();
        var val3="shalu";

        Assertions.assertFalse(StringUtil.isEqual(val1, val2));
        Assertions.assertFalse(StringUtil.isEqual(val1, val3));
        Assertions.assertTrue(StringUtil.isEqual(val2, val3));
    }

    @Test
    void whenStringInstanceComparisonWithEqualsAndSameValueThenReturnTrue() {
        var val1 = new String("shalu");
        var val2 = "shalu";
        var isEquals = StringUtil.isEquals(val1, val2);
        Assertions.assertTrue(isEquals);
    }
    @Test
    void whenStringInstanceComparisonWithEqualsAndOneNullValueThenReturnFalse() {
        var val1 = new String("shalu");
        var isEquals = StringUtil.isEquals(null, val1);
        Assertions.assertFalse(isEquals);
    }
    @Test
    void whenStringInstanceComparisonWithEqualsAndBothNullValueThenReturnTrue() {

        var isEquals = StringUtil.isEquals(null, null);
        Assertions.assertTrue(isEquals);
    }
    @Test
    void whenStringInstanceComparisonWithEqualsAndDifValueThenReturnFalse() {
        var val1 = new String("Shalu");
        var val2 = "shalu";
        var isEquals = StringUtil.isEquals(val1, val2);
        Assertions.assertFalse(isEquals);
    }

    @Test
    void whenStringInstanceComparisonWithEqualsIgnoreCaseAndSameValueThenReturnFalse() {
        var val1 = new String("Shalu");
        var val2 = "shalu";
        var isEquals = StringUtil.isEqualsIgnoreCase(val1, val2);
        Assertions.assertTrue(isEquals);
    }
    @Test
    void whenStringInstanceComparisonWithEqualsIgnoreCaseAndOneNullValueThenReturnFalse() {
        var val1 = new String("shalu");
        var isEquals = StringUtil.isEquals(null, val1);
        Assertions.assertFalse(isEquals);
    }
    @Test
    void whenStringInstanceComparisonWithEqualsIgnoreCaseAndBothNullValueThenReturnTrue() {

        var isEquals = StringUtil.isEquals(null, null);
        Assertions.assertTrue(isEquals);
    }

}
