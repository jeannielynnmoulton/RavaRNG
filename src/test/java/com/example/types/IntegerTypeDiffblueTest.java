package com.example.types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IntegerTypeDiffblueTest {
    /**
     * Test {@link IntegerType#intValue()}.
     *
     * <p>Method under test: {@link IntegerType#intValue()}
     */
    @Test
    @DisplayName("Test intValue()")
    @Tag("MaintainedByDiffblue")
    void testIntValue() {
        // Arrange, Act and Assert
        assertEquals(1, new IntegerType(1).intValue());
    }

    /**
     * Test {@link IntegerType#longValue()}.
     *
     * <p>Method under test: {@link IntegerType#longValue()}
     */
    @Test
    @DisplayName("Test longValue()")
    @Tag("MaintainedByDiffblue")
    void testLongValue() {
        // Arrange, Act and Assert
        assertEquals(1L, new IntegerType(1).longValue());
    }

    /**
     * Test {@link IntegerType#floatValue()}.
     *
     * <p>Method under test: {@link IntegerType#floatValue()}
     */
    @Test
    @DisplayName("Test floatValue()")
    @Tag("MaintainedByDiffblue")
    void testFloatValue() {
        // Arrange, Act and Assert
        assertEquals(1.0f, new IntegerType(1).floatValue());
    }

    /**
     * Test {@link IntegerType#doubleValue()}.
     *
     * <p>Method under test: {@link IntegerType#doubleValue()}
     */
    @Test
    @DisplayName("Test doubleValue()")
    @Tag("MaintainedByDiffblue")
    void testDoubleValue() {
        // Arrange, Act and Assert
        assertEquals(1.0d, new IntegerType(1).doubleValue());
    }
}
