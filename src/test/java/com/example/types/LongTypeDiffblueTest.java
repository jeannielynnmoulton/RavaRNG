package com.example.types;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LongTypeDiffblueTest {
    /**
     * Test {@link LongType#intValue()}.
     *
     * <p>Method under test: {@link LongType#intValue()}
     */
    @Test
    @DisplayName("Test intValue()")
    @Tag("MaintainedByDiffblue")
    void testIntValue() {
        // Arrange, Act and Assert
        assertEquals(1, new LongType(1L).intValue());
    }

    /**
     * Test {@link LongType#longValue()}.
     *
     * <p>Method under test: {@link LongType#longValue()}
     */
    @Test
    @DisplayName("Test longValue()")
    @Tag("MaintainedByDiffblue")
    void testLongValue() {
        // Arrange, Act and Assert
        assertEquals(1L, new LongType(1L).longValue());
    }

    /**
     * Test {@link LongType#floatValue()}.
     *
     * <p>Method under test: {@link LongType#floatValue()}
     */
    @Test
    @DisplayName("Test floatValue()")
    @Tag("MaintainedByDiffblue")
    void testFloatValue() {
        // Arrange, Act and Assert
        assertEquals(1.0f, new LongType(1L).floatValue());
    }

    /**
     * Test {@link LongType#doubleValue()}.
     *
     * <p>Method under test: {@link LongType#doubleValue()}
     */
    @Test
    @DisplayName("Test doubleValue()")
    @Tag("MaintainedByDiffblue")
    void testDoubleValue() {
        // Arrange, Act and Assert
        assertEquals(1.0d, new LongType(1L).doubleValue());
    }
}
