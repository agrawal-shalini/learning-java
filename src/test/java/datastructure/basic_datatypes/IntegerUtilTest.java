package datastructure.basic_datatypes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerUtilTest {

    @Test
    @DisplayName("Test primitive int equality")
    void whenSameValuesPassedThenReturnTrue() {
        var isEqual = IntegerUtil.checkWithDoubleEquals(5, 5);
        Assertions.assertTrue(isEqual);
    }

    @Test
    @DisplayName("Test primitive int equality")
    void whenDifferentValuesPassedThenReturnFalse() {
        var isEqual = IntegerUtil.checkWithDoubleEquals(5, 6);
        Assertions.assertFalse(isEqual);
    }

    @Test
    @DisplayName("Test Wrapper Integer equality with == when values are within range -127 to 127")
    void whenSameWrapperValuesPassedWithinRangeAndCheckedWithDoubleEqualsThenReturnTrue() {
        Integer val1=127;
        Integer val2=127;
        var isEqual = IntegerUtil.checkWithDoubleEquals(val1, val2);
        Assertions.assertTrue(isEqual);
    }

    @Test
    @DisplayName("Test Wrapper Integer equalitywith == when values are outside range -127 to 127")
    void whenSameWrapperValuesPassedOutsideRangeAndCheckedWithDoubleEqualsThenReturnFalse() {
        Integer val1=128;
        Integer val2=128;
        var isEqual = IntegerUtil.checkWithDoubleEquals(val1, val2);
        Assertions.assertFalse(isEqual);
    }

    @Test
    @DisplayName("Test Wrapper Integer equality when values are within range -127 to 127")
    void whenSameWrapperValuesPassedWithinRangeAndCheckedWithEqualsThenReturnTrue() {
        Integer val1=127;
        Integer val2=127;
        var isEqual = IntegerUtil.checkWithEquals(val1, val2);
        Assertions.assertTrue(isEqual);
    }

    @Test
    @DisplayName("Test Wrapper Integer equality when values are outside range -127 to 127")
    void whenSameWrapperValuesPassedOutsideRangeAndCheckedWithEqualsThenReturnFalse() {
        Integer val1=500;
        Integer val2=500;
        var isEqual = IntegerUtil.checkWithEquals(val1, val2);
        Assertions.assertTrue(isEqual);
    }

    @Test
    @DisplayName("Test Wrapper Integer equality when values are outside range -127 to 127")
    void whenDifferentWrapperValuesPassedOutsideRangeAndCheckedWithEqualsThenReturnFalse() {
        Integer val1=128;
        Integer val2=500;
        var isEqual = IntegerUtil.checkWithEquals(val1, val2);
        Assertions.assertFalse(isEqual);
    }

}